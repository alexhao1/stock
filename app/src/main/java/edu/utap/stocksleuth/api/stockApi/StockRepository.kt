package edu.utap.stocksleuth.api.stockApi

import android.text.SpannableString
import org.json.JSONObject


class StockRepository() {

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