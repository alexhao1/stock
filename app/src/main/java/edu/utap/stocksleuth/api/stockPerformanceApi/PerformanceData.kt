package edu.utap.stocksleuth.api.stockPerformanceApi

import android.text.SpannableString
import com.google.gson.annotations.SerializedName
import org.json.JSONArray
import org.json.JSONObject

data class PerformanceData(

    @SerializedName("c")
    val tickerData: List<Double>,
    @SerializedName("s")
    val status: String
)