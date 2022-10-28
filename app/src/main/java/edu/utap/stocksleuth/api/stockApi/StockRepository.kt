package edu.utap.stocksleuth.api.stockApi

import android.text.SpannableString
import com.google.gson.GsonBuilder

class StockRepository(private val stockApi: StockApi) {

    val gson = GsonBuilder().registerTypeAdapter(
        SpannableString::class.java, StockApi.SpannableDeserializer()
    ).create()

    fun getStocks():List<Stock>{
        var stocks = mutableListOf<Stock>()
        getStocks()
        //convert whatever is returned from json into a list of Stocks, which simply holds name and ticker strings
        return stocks
    }
}