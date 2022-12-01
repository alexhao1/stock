package edu.utap.stocksleuth.api.tweetApi


import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.core.text.clearSpans
import com.google.gson.annotations.SerializedName

data class Tweet(

//lategame potential add on: on tweet click open intent that visits link to that tweet
    @SerializedName("user")
    val author: User,
    @SerializedName("created_at")
    val dateTime: SpannableString,
    @SerializedName("text")
    val body: SpannableString,
    @SerializedName("favorite_count")
    val favorites: Integer,
    @SerializedName("retweet_count")
    val retweets: Integer
) {
    companion object {
        private fun findAndSetSpan(fulltext: SpannableString, subtext: String): Boolean {
            if (subtext.isEmpty()) return true
            val i = fulltext.indexOf(subtext, ignoreCase = true)
            if (i == -1) return false
            fulltext.setSpan(
                ForegroundColorSpan(Color.CYAN), i, i + subtext.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            return true
        }

        fun spannableStringsEqual(a: SpannableString?, b: SpannableString?): Boolean {
            if(a == null && b == null) return true
            if(a == null && b != null) return false
            if(a != null && b == null) return false
            val spA = a!!.getSpans(0, a.length, Any::class.java)
            val spB = b!!.getSpans(0, b.length, Any::class.java)
            return a.toString() == b.toString()
                    &&
                    spA.size == spB.size && spA.equals(spB)

        }


    }
    private fun clearSpan(str: SpannableString?) {
        str?.clearSpans()
        str?.setSpan(
            ForegroundColorSpan(Color.GRAY), 0, 0,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }
    private fun removeAllCurrentSpans(){
        // Erase all spans
//        clearSpan(author)
        clearSpan(body)
    }
    fun searchFor(searchTerm: String): Boolean {
        // XXX Write me, search both regular posts and subreddit listings
        removeAllCurrentSpans()
//        if(author.contains(searchTerm)){
//            findAndSetSpan(author, searchTerm)
//            return true
//        }
        if(body?.contains(searchTerm) == true){
            findAndSetSpan(body, searchTerm)
            return true
        }
        else {
            return false
        }
    }
    override fun equals(other: Any?) : Boolean =
        if (other is Tweet) {
            body == other.body
        } else {
            false
        }

}