package edu.utap.stocksleuth.api.congressApi

import android.text.SpannableString
import com.google.gson.GsonBuilder
import edu.utap.stocksleuth.api.tweetApi.Tweet
import edu.utap.stocksleuth.api.tweetApi.TweetApi

class CongressRepository(private val congressApi: CongressApi) {
    val gson = GsonBuilder().registerTypeAdapter(
        SpannableString::class.java, TweetApi.SpannableDeserializer()
    ).create()

    suspend fun getCongress(stock: String): List<Congress> {

        println("gettin congress")
        return congressApi.getCongress(stock)


    }
}