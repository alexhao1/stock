package edu.utap.stocksleuth.ui.performance

import android.R
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import edu.utap.stocksleuth.api.stockPerformanceApi.PerformanceData
import edu.utap.stocksleuth.databinding.FragmentCongressBinding
import edu.utap.stocksleuth.databinding.FragmentPerformanceBinding
import edu.utap.stocksleuth.ui.MainViewModel
import edu.utap.stocksleuth.ui.congress.CongressAdapter
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
            println("observing new performance")
            binding.chart.data = setLineChartData(it)

        })


        val aa = ArrayAdapter(binding.root.context, android.R.layout.simple_spinner_item, timeframeList)
        // Set layout to use when the list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.timeframe.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>,
                                        view: View, position: Int, id: Long) {
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
        var values = ArrayList<Entry>()
        var yData = data.tickerData
        for(i in data.tickerData.indices){
            values.add(Entry(i.toFloat(),yData[i].toFloat()))
        }
        val set = LineDataSet(values, viewModel.observeSelectedStock().value.toString())

        var percentage = (data.tickerData[data.tickerData.size-1] - data.tickerData[0]) / data.tickerData[0]*100
        var round = (100*percentage).roundToInt().toDouble() / 100
        binding.chart.description.text = round.toString()+"%"
        binding.chart.description.textSize = 20F
        if(data.tickerData[0]<data.tickerData[data.tickerData.size-1]){
            set.color = Color.GREEN
            binding.chart.description.textColor = Color.GREEN
        }
        else{
            set.color = Color.RED
            binding.chart.description.textColor = Color.RED
        }

        val dataSet = LineData(set)

        return dataSet
    }

}