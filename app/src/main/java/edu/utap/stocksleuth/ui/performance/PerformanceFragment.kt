package edu.utap.stocksleuth.ui.performance

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import edu.utap.stocksleuth.api.stockPerformanceApi.PerformanceData
import edu.utap.stocksleuth.databinding.FragmentPerformanceBinding
import edu.utap.stocksleuth.ui.MainViewModel
import kotlin.math.roundToInt

class PerformanceFragment : Fragment() {

    private val viewModel: MainViewModel by activityViewModels()
    private var _binding: FragmentPerformanceBinding? = null
    private val binding get() = _binding!!
    val timeframeList = listOf("H","D","W","M","Y")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPerformanceBinding.inflate(inflater, container, false)
        return binding.root
    }
//
//    override fun onCreate(savedInstanceState: Bundle?){
//        super.onCreate(savedInstanceState)
//    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(javaClass.simpleName, "onViewCreated Performance")
        viewModel.netPerformance()
        viewModel.observePerformance().observe(viewLifecycleOwner, Observer{
            //update chart
            Log.d(javaClass.simpleName, "LOG: The initial data is ${it}")
            println("observing new performance")
            // DO NOT simplfy this code. IDE assumes no null will be passed, but an empty
            // PerformanceData can stil be passed, which is our equivalent of a null.
            var xAxis = binding.chart.xAxis
            if(viewModel.getTimeSpan()=="H"||viewModel.getTimeSpan()=="D") {
                xAxis.valueFormatter = HourAxisFormatter()
            }
            else{
                xAxis.valueFormatter = DateAxisFormatter()
            }
            xAxis.textSize = 7.5f
            if (it.tickerData != null) {

                binding.chart.data = setLineChartData(it)
            }
            else {
                binding.chart.data = null
            }
            binding.chart.invalidate()
            Log.d(javaClass.simpleName, "LOG: The data is ${binding.chart.data}")
        })

        val aa = ArrayAdapter(binding.root.context, android.R.layout.simple_spinner_item, timeframeList)
        // Set layout to use when the list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.timeframe.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Log.d("XXX", "pos $position")
                println(timeframeList[position])
                viewModel.setTimeframe(timeframeList[position])
                viewModel.netPerformance()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
                Log.d("XXX", "onNothingSelected")
            }
        }
        // Set Adapter to Spinner
        binding.timeframe.adapter = aa
        // Set initial value of spinner to medium
        val initialSpinner = 3
        binding.timeframe.setSelection(initialSpinner)
        viewModel.setTimeframe(timeframeList[initialSpinner])
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun setLineChartData(data: PerformanceData): LineData {
        println("UPDATING LINE CHART")
        Log.d(javaClass.simpleName, "LOG: Printing the updated chart list data ${data.toString()}")
        val values = ArrayList<Entry>()
        val yData = data.tickerData
        val fromDate = viewModel.getStartDate()
        val toDate = viewModel.getToDate()
        val binSize = (toDate-fromDate)/yData.size
        for (i in data.tickerData.indices) {

            values.add(Entry(((i*binSize)+fromDate).toFloat(), yData[i].toFloat()))
        }
        val set = LineDataSet(values, viewModel.observeSelectedStock().value.toString())


        val percentage =
            (data.tickerData[data.tickerData.size - 1] - data.tickerData[0]) / data.tickerData[0] * 100
        val round = (100 * percentage).roundToInt().toDouble() / 100
        binding.chart.description.text = round.toString() + "%"
        binding.chart.description.textSize = 20F
        if (data.tickerData[0] < data.tickerData[data.tickerData.size - 1]) {
            set.color = Color.GREEN
            binding.chart.description.textColor = Color.GREEN
        } else {
            set.color = Color.RED
            binding.chart.description.textColor = Color.RED
        }

        return LineData(set)
    }
    //x axis units: time for hour, time for day, days for week, days for month, months for yr
}