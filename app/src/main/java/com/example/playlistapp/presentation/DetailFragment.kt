package com.example.playlistapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.playlistapp.R
import com.example.playlistapp.base.BindingFragment
import com.example.playlistapp.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : BindingFragment<FragmentDetailBinding>(R.layout.fragment_detail) {
//    private val searchViewModel by viewModels<SearchViewModel>()
//    private val searchResultAdapter by lazy { SearchResultAdapter(SearchItem.BOOK_ITEM_TYPE) }
//    private val viewType: Int = SearchItem.BOOK_ITEM_TYPE

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding.apply {
            lifecycleOwner = viewLifecycleOwner
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        arguments?.let {
            val arguments = DetailFragmentArgs.fromBundle(it)
            binding.song = arguments.song
        }
        setRecyclerViewAdapter()
        subscribeData()
    }

    private fun setRecyclerViewAdapter() {

    }

    private fun subscribeData() {
    }


}