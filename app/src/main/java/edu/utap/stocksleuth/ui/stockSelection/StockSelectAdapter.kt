package edu.utap.stocksleuth.ui.stockSelection

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import edu.utap.stocksleuth.R
import edu.utap.stocksleuth.api.stockApi.Stock
import edu.utap.stocksleuth.databinding.RowStockBinding
import edu.utap.stocksleuth.ui.MainViewModel

class StockSelectAdapter(private val viewModel: MainViewModel,
                         private val fragmentActivity: FragmentActivity
)
    : ListAdapter<Stock, StockSelectAdapter.VH>(StockDiff()) {
        inner class VH(val rowStockBinding: RowStockBinding):
                RecyclerView.ViewHolder(rowStockBinding.root){
                    init{
                        if (viewModel.isSelected() == -1) {
                            viewModel.setStock((currentList[0]))
                            viewModel.setSelected(0, currentList[0])
                        }
                        rowStockBinding.root.setOnClickListener{
                            //set stock selected to this stock
                            viewModel.setStock(currentList[adapterPosition])
                            viewModel.setSelected(adapterPosition, currentList[adapterPosition])
                            notifyDataSetChanged()
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
        binding.rowFav.setOnClickListener {
            if (viewModel.isFavorite(currentList[position])) {
                viewModel.removeFavorite(currentList[position])
            }
            else {
                viewModel.addFavorite(currentList[position])
            }
            viewModel.setModifiedFav()
            notifyItemChanged(position)
        }

        if (viewModel.isFavorite(currentList[position])) {
            binding.rowFav.setImageResource(R.drawable.ic_favorite_black_24dp)
        }
        else {
            binding.rowFav.setImageResource(R.drawable.ic_favorite_border_black_24dp)
        }
        if(viewModel.isStock(currentList[position])) {
            holder.itemView.setBackgroundColor(Color.GRAY)
        }
        else {
            holder.itemView.setBackgroundColor(Color.WHITE)
        }
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