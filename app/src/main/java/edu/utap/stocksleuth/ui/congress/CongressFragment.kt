package edu.utap.stocksleuth.ui.congress

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import edu.utap.stocksleuth.databinding.FragmentCongressBinding
import edu.utap.stocksleuth.databinding.FragmentStocksBinding
import edu.utap.stocksleuth.ui.MainViewModel
import edu.utap.stocksleuth.ui.stockSelection.StockSelectAdapter


class CongressFragment : Fragment() {

    private val viewModel: MainViewModel by activityViewModels()
    private var _binding: FragmentCongressBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCongressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(javaClass.simpleName, "onViewCreated")
        binding.recyclerView.layoutManager = LinearLayoutManager(binding.recyclerView.context)
        binding.recyclerView.adapter = CongressAdapter(viewModel, this.requireActivity())
        viewModel.netCongress()
        viewModel.observeCongress().observe(viewLifecycleOwner, Observer{
            (binding.recyclerView.adapter as CongressAdapter).submitList(it)
        })



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}