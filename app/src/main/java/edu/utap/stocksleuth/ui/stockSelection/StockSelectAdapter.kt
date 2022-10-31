package edu.utap.stocksleuth.ui.stockSelection

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import edu.utap.stocksleuth.api.stockApi.Stock
import edu.utap.stocksleuth.databinding.RowStockBinding

class StockSelectAdapter(private val viewModel: MainViewModel,
                         private val fragmentActivity: FragmentActivity
)
    : ListAdapter<Stock, StockSelectAdapter.VH>(StockDiff()) {

        inner class VH(val rowStockBinding: RowStockBinding):
                RecyclerView.ViewHolder(rowStockBinding.root){
                    init{
                        rowStockBinding.root.setOnClickListener{
                            //set stock selected to this stock
                        }
                    }
                }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val rowBinding = RowStockBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return VH(rowBinding)

    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val binding = holder.rowStockBinding

        binding.name.text = currentList[position].title
        binding.ticker.text = currentList[position].ticker
    }
    class StockDiff :  DiffUtil.ItemCallback<Stock>(){
        override fun areItemsTheSame(oldItem: Stock, newItem: Stock): Boolean {
            return oldItem.ticker == newItem.ticker
        }
        override fun areContentsTheSame(oldItem: Stock, newItem: Stock): Boolean {
            return Stock.spannableStringsEqual(oldItem.title, newItem.title) &&
                    Stock.spannableStringsEqual(oldItem.ticker, newItem.ticker)


        }
    }
}