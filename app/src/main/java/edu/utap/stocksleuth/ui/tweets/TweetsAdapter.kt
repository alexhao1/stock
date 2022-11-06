package edu.utap.stocksleuth.ui.tweets

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import edu.utap.stocksleuth.api.stockApi.Stock
import edu.utap.stocksleuth.api.tweetApi.Tweet
import edu.utap.stocksleuth.databinding.RowTweetBinding
import edu.utap.stocksleuth.ui.MainViewModel


class TweetsAdapter(private val viewModel: MainViewModel,
                    private val fragmentActivity: FragmentActivity
)
    : ListAdapter<Tweet, TweetsAdapter.VH>(TweetDiff()) {

    inner class VH(val rowTweetBinding: RowTweetBinding):
        RecyclerView.ViewHolder(rowTweetBinding.root){
        init{
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsAdapter.VH {
        val rowBinding = RowTweetBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return VH(rowBinding)
    }

    override fun onBindViewHolder(holder: TweetsAdapter.VH, position: Int) {
        val binding = holder.rowTweetBinding

        binding.author.text = "@"+currentList[position].author.screenName
        binding.dateTime.text = currentList[position].dateTime
        binding.bodyText.text = currentList[position].body
        binding.favsAmount.text = currentList[position].favorites.toString()
        binding.retweetsAmount.text = currentList[position].retweets.toString()

    }


    class TweetDiff :  DiffUtil.ItemCallback<Tweet>(){
        override fun areItemsTheSame(oldItem: Tweet, newItem: Tweet): Boolean {
            return oldItem.body == newItem.body
        }
        override fun areContentsTheSame(oldItem: Tweet, newItem: Tweet): Boolean {
            return Tweet.spannableStringsEqual(oldItem.body, newItem.body)
//                   && Tweet.spannableStringsEqual(oldItem.author, newItem.author)
                    && Tweet.spannableStringsEqual(oldItem.dateTime,newItem.dateTime)


        }
    }
}