package edu.utap.stocksleuth.api.stockPerformanceApi

import com.google.gson.annotations.SerializedName

data class PerformanceData(

    @SerializedName("c")
    val tickerData: List<Double>,
    @SerializedName("s")
    val status: String
)