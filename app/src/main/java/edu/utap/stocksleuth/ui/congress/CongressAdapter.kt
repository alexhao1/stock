package edu.utap.stocksleuth.ui.congress

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import edu.utap.stocksleuth.R
import edu.utap.stocksleuth.api.congressApi.Congress
import edu.utap.stocksleuth.api.stockApi.Stock
import edu.utap.stocksleuth.databinding.RowCongressBinding
import edu.utap.stocksleuth.databinding.RowStockBinding
import edu.utap.stocksleuth.ui.MainViewModel
import edu.utap.stocksleuth.ui.stockSelection.StockSelectAdapter

class CongressAdapter(private val viewModel: MainViewModel,
                      private val fragmentActivity: FragmentActivity
)
    : ListAdapter<Congress, CongressAdapter.VH>(CongressDiff()) {

    inner class VH(val rowCongressBinding: RowCongressBinding):
        RecyclerView.ViewHolder(rowCongressBinding.root){
        init{

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val rowBinding = RowCongressBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return VH(rowBinding)

    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val binding = holder.rowCongressBinding

        binding.name.text = currentList[position].congressMember
//        println("results: "+currentList[position].congressMember+" "+currentList[position].dateTime+" "+currentList[position].ticker)
        binding.date.text = currentList[position].dateTime
//        binding.ticker.text = currentList[position].ticker --Maybe ticker not needed bc its same val all down column
        binding.action.text = currentList[position].action
        if(binding.action.text.toString() == "Purchase"){
            binding.action.setTextColor(Color.parseColor("#00FF00"))
        }
        else{
            binding.action.setTextColor(Color.parseColor("#FF0000"))
        }
        binding.amount.text = "$"+currentList[position].amount.toString()


    }
    class CongressDiff :  DiffUtil.ItemCallback<Congress>(){
        override fun areItemsTheSame(oldItem: Congress, newItem: Congress): Boolean {
            return oldItem.ticker == newItem.ticker
        }
        override fun areContentsTheSame(oldItem: Congress, newItem: Congress): Boolean {
            return Congress.spannableStringsEqual(oldItem.dateTime, newItem.dateTime) &&
                    Congress.spannableStringsEqual(oldItem.ticker, newItem.ticker)
                    && Congress.spannableStringsEqual(oldItem.congressMember, newItem.congressMember)


        }
    }
}