package edu.utap.stocksleuth.api.stockApi

import android.text.SpannableString
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.json.JSONArray
import retrofit2.Call



class StockRepository(private val stockApi: StockApi) {

    val gson = GsonBuilder().registerTypeAdapter(
        SpannableString::class.java, StockApi.SpannableDeserializer()
    ).create()

//    private fun unpackStocks(response: StockApi.JSONArray): List<Stock>{
//        var stocks = mutableListOf<Stock>()
//        for(i in 0 until response.length()){
//            val item = response.data.getJSONObject(i)
//            stocks.add(Stock(item.figi, item.description, item.displaySymbol))
//        }
//        return stocks
//    }
    suspend fun getStocks():List<Stock>{
//        var stocks = mutableListOf<Stock>()
        return stockApi.getStocks()

//        var listResult : Array<Stock> = gson.fromJson(
//            stockApi.getStocks(),
//            Array<Stock> :: class.java
//        )
//
//        stocks.addAll(listResult)

        //convert whatever is returned from json into a list of Stocks, which simply holds name and ticker strings

    }
}