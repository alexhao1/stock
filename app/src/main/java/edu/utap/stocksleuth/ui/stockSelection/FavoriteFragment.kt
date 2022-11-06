package edu.utap.stocksleuth.ui.stockSelection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import edu.utap.stocksleuth.R
import edu.utap.stocksleuth.databinding.FragmentFavoritesBinding
import edu.utap.stocksleuth.ui.MainViewModel

class FavoriteFragment : Fragment() {
    private val viewModel: MainViewModel by activityViewModels()
    private var _binding: FragmentFavoritesBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: StockSelectAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoritesBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.favoriteRV.layoutManager = LinearLayoutManager(binding.favoriteRV.context)
        adapter = StockSelectAdapter(viewModel, this.requireActivity())
        viewModel.observeFav().observe(viewLifecycleOwner) {
            it?.let {
                adapter.submitList(it)
                adapter.notifyDataSetChanged()
            }
        }
        binding.favoriteRV.adapter = adapter
    }

}