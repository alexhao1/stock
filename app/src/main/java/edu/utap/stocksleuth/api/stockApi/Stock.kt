package edu.utap.stocksleuth.api.stockApi

import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.core.text.clearSpans

import com.google.gson.annotations.SerializedName

data class Stock (
    @SerializedName("name") //find actual name in json later
    val key: String,
    @SerializedName("description")
    val title: SpannableString,
    @SerializedName("displaySymbol")
    val ticker: SpannableString,

)
{
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
        clearSpan(title)
        clearSpan(ticker)
    }
    fun searchFor(searchTerm: String): Boolean {
        // XXX Write me, search both regular posts and subreddit listings
        removeAllCurrentSpans()
        if(title.contains(searchTerm)){
            findAndSetSpan(title,searchTerm)
            return true
        }
        if(ticker?.contains(searchTerm) == true){
            findAndSetSpan(ticker,searchTerm)
            return true
        }
        else {
            return false
        }
    }
    override fun equals(other: Any?) : Boolean =
        if (other is Stock) {
            key == other.key
        } else {
            false
        }
}