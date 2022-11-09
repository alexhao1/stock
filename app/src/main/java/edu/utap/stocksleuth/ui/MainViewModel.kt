package edu.utap.stocksleuth.ui

import androidx.lifecycle.*
import edu.utap.stocksleuth.api.congressApi.Congress
import edu.utap.stocksleuth.api.congressApi.CongressApi
import edu.utap.stocksleuth.api.congressApi.CongressRepository
import edu.utap.stocksleuth.api.stockApi.Stock
import edu.utap.stocksleuth.api.stockApi.StockApi
import edu.utap.stocksleuth.api.stockApi.StockRepository
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
    private var tweet = MutableLiveData<Tweet>()
    private val tweetApi = TweetApi.create()
    private var tweetList = MutableLiveData<List<Tweet>>()
    private val tweetRepository = TweetRepository(tweetApi)
    private val addlParams = mapOf<String,String>()

    private var congress = MutableLiveData<Congress>()
    private var congressApi = CongressApi.create()
    private var congressList = MutableLiveData<List<Congress>>()
    private val congressRepository = CongressRepository(congressApi)
    var netCongressDone : MutableLiveData<Boolean> = MutableLiveData(false)

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
        } ?: favList.value!!
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
        return favStocks.contains(stock)
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
//            rawTweetData.postValue(_tweetLookup.getRecentTweets(stock.value!!.ticker.toString(),addlParams) as Response<MultipleTweetPayload>?)
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
}