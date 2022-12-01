package edu.utap.stocksleuth.ui.tweets

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import edu.utap.stocksleuth.databinding.FragmentTweetsBinding
import edu.utap.stocksleuth.ui.MainViewModel

class TweetsFragment : Fragment() {

    private var _binding: FragmentTweetsBinding? = null
    val viewModel: MainViewModel by activityViewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTweetsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(javaClass.simpleName, "onViewCreatedTweets, current stock: "+viewModel.observeSelectedStock().value?.ticker.toString())
        binding.recyclerView.layoutManager = LinearLayoutManager(binding.recyclerView.context)
        binding.recyclerView.adapter = TweetsAdapter(viewModel, this.requireActivity())

        viewModel.observeSelectedStock().observe(viewLifecycleOwner,Observer {
            println("observing changed stock")
            viewModel.netTweets()
        })


        viewModel.observeTweets().observe(viewLifecycleOwner, Observer{
            println("observing new tweets from "+ viewModel.observeSelectedStock().value?.ticker.toString())
            (binding.recyclerView.adapter as TweetsAdapter).submitList(it)
        })
        //search
        binding.search.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(
                s: CharSequence?, start: Int, count: Int, after: Int
            ) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                viewModel.searchTweets(s.toString())
            }
        }) //maybe a search for tweets isnt necessary

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}