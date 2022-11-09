package edu.utap.stocksleuth.api.congressApi

import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import com.google.gson.annotations.SerializedName
import edu.utap.stocksleuth.api.tweetApi.User

data class Congress(

    @SerializedName("Representative")
    val congressMember: SpannableString,
    @SerializedName("TransactionDate")
    val dateTime: SpannableString,
    @SerializedName("Ticker")
    val ticker: SpannableString,
    @SerializedName("Transaction")
    val action: SpannableString,
    @SerializedName("Amount")
    val amount: Double
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

}