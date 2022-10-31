package edu.utap.stocksleuth.api.stockApi

import android.R
import android.text.SpannableString
import com.google.gson.GsonBuilder
import org.json.JSONObject
import java.io.*


class StockRepository(private val stockApi: StockApi) {
    val gson = GsonBuilder().registerTypeAdapter(
        SpannableString::class.java, StockApi.SpannableDeserializer()
    ).create()

    fun getStocks():List<Stock>{
    //        return stockApi.getStocks()

        val jsonString = ListOfStocks
        val jsonObj = JSONObject(jsonString)

        val jsonArray = jsonObj.optJSONArray("StockData")
        var stocks = mutableListOf<Stock>()

        for(i in 0 until jsonArray.length()){
            val jsonObject = jsonArray.getJSONObject(i)
            val name = SpannableString(jsonObject.optString("Description"))
            val tick  = SpannableString(jsonObject.optString("Symbol"))
            stocks.add(Stock(name,tick))
        }
        return stocks
    }

}