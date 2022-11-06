package edu.utap.stocksleuth.api.tweetApi

import android.text.SpannableString
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("screen_name")
    val screenName: SpannableString
){

}