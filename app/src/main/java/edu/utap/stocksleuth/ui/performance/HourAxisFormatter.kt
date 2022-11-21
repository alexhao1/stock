package edu.utap.stocksleuth.ui.performance

import android.icu.text.SimpleDateFormat
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import java.util.*

class HourAxisFormatter : IndexAxisValueFormatter() {
    override fun getFormattedValue(value: Float): String? {
        // Convert float value to date string
        // Convert from seconds back to milliseconds to format time  to show to the user
        val timeSince = value.toLong() * 1000

        // Show time in local version
        val timeMilliseconds = Date(timeSince)
        val dateTimeFormat = SimpleDateFormat("HH:mm",Locale.getDefault())
        return dateTimeFormat.format(timeMilliseconds)
    }
}