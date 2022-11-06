package edu.utap.stocksleuth.ui

import androidx.lifecycle.*
import edu.utap.stocksleuth.api.stockApi.Stock
import edu.utap.stocksleuth.api.stockApi.StockApi
import edu.utap.stocksleuth.api.stockApi.StockRepository
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

    private val redditApi = StockApi.create()
    private val repository = StockRepository(redditApi)
    var netStocksDone : MutableLiveData<Boolean> = MutableLiveData(false)
    var favStocks = mutableListOf<Stock>()

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
    //FAVORITES stuff to be implemented later
//    fun getFavoriteAt(position: Int) : RedditPost {
//        return favPosts[position]
//    }
//
//
//    fun isFavorite(favPost: RedditPost): Boolean {
//        return favPosts.contains(favPost)
//    }
//    fun addFavorite(favPost: RedditPost) {
//        favPosts.add(favPost)
//        favList.value = favPosts
//    }
//    fun removeFavorite(favPost: RedditPost) {
//        favPosts.remove(favPost)
//        favList.value = favPosts
//    }
//    fun getItemAt(position: Int) : RedditPost {
//        return list.value!![position]
//    }
}