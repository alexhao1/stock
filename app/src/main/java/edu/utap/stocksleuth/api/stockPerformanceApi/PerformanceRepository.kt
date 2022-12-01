package edu.utap.stocksleuth.api.stockPerformanceApi

import android.text.SpannableString
import com.google.gson.GsonBuilder
import edu.utap.stocksleuth.api.tweetApi.TweetApi

class PerformanceRepository(private val performanceApi: PerformanceApi) {
    val gson = GsonBuilder().registerTypeAdapter(
        SpannableString::class.java, TweetApi.SpannableDeserializer()
    ).create()

    suspend fun getPerformance(stock: String, resolution: String, fromDate: Long, toDate: Long, token: String): PerformanceData {

        println("gettin performance")

        return performanceApi.getPerformance(stock,resolution,fromDate.toString(),toDate.toString(), token)


    }
}