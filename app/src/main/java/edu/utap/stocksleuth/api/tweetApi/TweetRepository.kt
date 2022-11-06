package edu.utap.stocksleuth.api.tweetApi

import android.text.SpannableString
import com.google.gson.GsonBuilder
import edu.utap.stocksleuth.ui.MainViewModel

//import com.tycz.tweedle.lib.api.Response
//import com.tycz.tweedle.lib.dtos.tweet.MultipleTweetPayload
//import com.tycz.tweedle.lib.dtos.tweet.TweetData

class TweetRepository(private val tweetApi: TweetApi) {
    val gson = GsonBuilder().registerTypeAdapter(
        SpannableString::class.java, TweetApi.SpannableDeserializer()
    ).create()

    suspend fun getTweets(stock: String): List<Tweet> {
        var posts = mutableListOf<Tweet>()
        println("gettin tweets")
        return tweetApi.getTweets(stock).statuses
//        return unpackPosts(tweetApi.getTweets(stock)) implement for user data later


    }

}