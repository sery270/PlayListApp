package com.example.playlistapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.playlistapp.R
import com.example.playlistapp.base.BindingFragment
import com.example.playlistapp.databinding.FragmentDetailBinding
import timber.log.Timber

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
        setRecyclerViewAdapter()
        subscribeData()
    }

    private fun setRecyclerViewAdapter() {

    }

    private fun subscribeData() {

    }

}