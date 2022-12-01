package edu.utap.stocksleuth.ui

import android.text.SpannableString
import androidx.lifecycle.*
import edu.utap.stocksleuth.api.congressApi.Congress
import edu.utap.stocksleuth.api.congressApi.CongressApi
import edu.utap.stocksleuth.api.congressApi.CongressRepository
import edu.utap.stocksleuth.api.stockApi.Stock
import edu.utap.stocksleuth.api.stockApi.StockApi
import edu.utap.stocksleuth.api.stockApi.StockRepository
import edu.utap.stocksleuth.api.stockPerformanceApi.PerformanceApi
import edu.utap.stocksleuth.api.stockPerformanceApi.PerformanceData
import edu.utap.stocksleuth.api.stockPerformanceApi.PerformanceRepository
import edu.utap.stocksleuth.api.tweetApi.Tweet
import edu.utap.stocksleuth.api.tweetApi.TweetApi
import edu.utap.stocksleuth.api.tweetApi.TweetRepository
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private var title = MutableLiveData<String>()
    private var ticker = MutableLiveData<String>()
    private var searchTerm = MutableLiveData<String>()
    private var stock = MutableLiveData<Stock>()
    private var stockList = MutableLiveData<List<Stock>>()
    private var favList = MutableLiveData<List<Stock>>()
    private var modifiedFav: MutableLiveData<Int> = MutableLiveData(0)

    private val stockApi = StockApi.create()
    private val repository = StockRepository(stockApi)
    var netStocksDone : MutableLiveData<Boolean> = MutableLiveData(false)
    var favStocks = mutableListOf<Stock>()

    private var searchTermTweet = MutableLiveData<String>()
    private val tweetApi = TweetApi.create()
    private var tweetList = MutableLiveData<List<Tweet>>()
    private val tweetRepository = TweetRepository(tweetApi)

    private var congressApi = CongressApi.create()
    private var congressList = MutableLiveData<List<Congress>>()
    private val congressRepository = CongressRepository(congressApi)
    var netCongressDone : MutableLiveData<Boolean> = MutableLiveData(false)

    private var timeSpan = "M"
    private var timeResolution = "60"
    private var performanceApi = PerformanceApi.create()
    private var performanceList = MutableLiveData<PerformanceData>()
    private val performanceRepository = PerformanceRepository(performanceApi)

    private var toDate = System.currentTimeMillis()/1000
    private val perfToken = "cd3m8ciad3ic2v61etl0cd3m8ciad3ic2v61etlg"
    private val secondsInYear = 31540000
    private val secondsInMonth = 2628000
    private val secondsInWeek = 604800
    private val secondsInDay = 86400
    private val secondsInHour = 3600
    private var fromDate = toDate-secondsInMonth


    var netTweetsDone : MutableLiveData<Boolean> = MutableLiveData(false)
    private var liveTweetsList = MediatorLiveData<List<Tweet>>().apply{
        addSource(searchTermTweet){
            value = filterTweetList()
        }
        value = tweetList.value
    }

    private var liveStockList = MediatorLiveData<List<Stock>>().apply{
        addSource(searchTerm){
            value = filterList()
        }
        value = stockList.value
    }

    private var liveFavoriteList = MediatorLiveData<List<Stock>>().apply {
        addSource(searchTerm) {
            value = filterFav()
        }
        value = favList.value
    }

    init {
        netStocks()
        netTweets()
        netCongress()
    }
    fun searchPosts(s: String){
        searchTerm.value = s
    }

    private fun filterList(): List<Stock>{
        val searchTermValue = searchTerm.value!!
        return stockList.value?.filter {
            var found = false
            found = found || it.searchFor(searchTermValue)
            found
        } ?: stockList.value!!
    }



    fun setStock(s: Stock) {
        stock.postValue(s)
    }

    // Used to keep track of highlighted row in stock recyclerview
    private var selected_row = -1
    private var selected_stock: Stock = Stock(title = SpannableString("N/A"), ticker = SpannableString("N/A"))
    fun isSelected() : Int {
        return selected_row
    }

    fun isStock(stock: Stock) : Boolean {
        return selected_stock.title.toString() == stock.title.toString() && selected_stock.ticker.toString() == stock.ticker.toString()
    }
    fun setSelected(position: Int, current_stock: Stock) {
        selected_row = position
        selected_stock = current_stock
    }
    fun netStocks() {
        netStocksDone.value = false
        viewModelScope.launch(
            context = viewModelScope.coroutineContext + Dispatchers.IO) {
//            stockList.postValue(repository.getStocks())
//            liveStockList.postValue(repository.getStocks())
            stockList.postValue(repository.getStocks())
            liveStockList.postValue(repository.getStocks())
        }

        netStocksDone.value = true
    }
    fun observeStocks(): LiveData<List<Stock>> {
        return liveStockList
    }
    fun observeSelectedStock(): LiveData<Stock>{
        return stock
    }


    // FAVORITES
    private fun filterFav(): List<Stock>{
        val searchTermValue = searchTerm.value!!
        return favList.value?.filter {
            var found = false
            found = found || it.searchFor(searchTermValue)
            found
        } ?: listOf()
    }

    fun observeFav(): LiveData<List<Stock>> {
        return liveFavoriteList
    }

    fun addFavorite(stock: Stock) {
        favStocks.add(stock)
        updateFavStock()
    }

    fun updateFavStock() {
        liveFavoriteList.value = favStocks
        favList.value = favStocks
    }

    fun isFavorite(stock: Stock): Boolean {
        for (i in favStocks) {
            if (i.title.toString() == stock.title.toString() && i.ticker.toString() == stock.ticker.toString())
                return true
        }
        return false
    }

    fun removeFavorite(stock: Stock) {
        favStocks.remove(stock)
        updateFavStock()
    }

    fun setModifiedFav() {
        modifiedFav.value = modifiedFav.value?.plus(1)
    }

    //TWEETS
    fun searchTweets(s: String){
        searchTermTweet.value = s
    }

    private fun filterTweetList(): List<Tweet>{
        val searchTermValue = searchTermTweet.value!!
        return tweetList.value?.filter {
            var found = false
            found = found || it.searchFor(searchTermValue)
            found
        } ?: tweetList.value!!
    }
    fun netTweets() {
        val coroutineExceptionHandler = CoroutineExceptionHandler{_, throwable ->
            throwable.printStackTrace()
        }

        netTweetsDone.value = false
        viewModelScope.launch(
            context = viewModelScope.coroutineContext + Dispatchers.IO + coroutineExceptionHandler) {
            tweetList.postValue(tweetRepository.getTweets(stock.value!!.ticker.toString()))
            liveTweetsList.postValue(tweetRepository.getTweets(stock.value!!.ticker.toString()))
        }

        netTweetsDone.value = true
    }

    fun observeTweets(): LiveData<List<Tweet>> {
        return liveTweetsList
    }

    fun netCongress(){
        val coroutineExceptionHandler = CoroutineExceptionHandler{_, throwable ->
            throwable.printStackTrace()
        }
        netCongressDone.value = false
        viewModelScope.launch(
            context = viewModelScope.coroutineContext + Dispatchers.IO + coroutineExceptionHandler) {
            congressList.postValue(congressRepository.getCongress(stock.value!!.ticker.toString()))

        }
        netCongressDone.value = true
    }

    fun observeCongress(): LiveData<List<Congress>>{
        return congressList
    }

    fun setTimeframe(level: String) {
        timeSpan = when {
            // Sanitize input
            level == "H" -> "H"
            level =="D" -> "D"
            level =="W" -> "W"
            level =="M" -> "M"
            level == "Y" -> "Y"
            else -> "M"

        }
        setTimeRes(timeSpan)
    }
    private fun setTimeRes(timeSpan: String){
        timeResolution = when {
            timeSpan == "H" -> "1"
            timeSpan == "D" -> "15"
            timeSpan == "W" -> "30"
            timeSpan == "M" -> "60"
            timeSpan == "Y" -> "D"
            else -> "60"
        }
        setFromDate(timeSpan)
    }



    private fun setFromDate(timeSpan:String){
        fromDate = when{
            timeSpan == "H" -> toDate - secondsInHour
            timeSpan == "D" -> toDate - secondsInDay
            timeSpan == "W" -> toDate - secondsInWeek
            timeSpan == "M" -> toDate - secondsInMonth
            timeSpan == "Y" -> toDate - secondsInYear
            else -> toDate - secondsInMonth
        }
    }

    fun netPerformance(){
        val coroutineExceptionHandler = CoroutineExceptionHandler{_, throwable ->
            throwable.printStackTrace()
        }
        viewModelScope.launch(
            context = viewModelScope.coroutineContext + Dispatchers.IO + coroutineExceptionHandler) {
            performanceList.postValue(performanceRepository.getPerformance(stock.value!!.ticker.toString(),timeResolution,fromDate,toDate,perfToken))


        }

    }
    fun netPerformanceWeekend(){
        //TODO
    }
    fun netPerformanceAfterHrs(){
        //TODO
    }

    fun observePerformance(): LiveData<PerformanceData>{
        return performanceList
    }
    fun getStartDate(): Long{
        return fromDate
    }
    fun getToDate():Long{
        return toDate
    }
    fun getTimeSpan(): String{
        return timeSpan
    }
}