package com.example.playlistapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.playlistapp.R
import com.example.playlistapp.base.BindingFragment
import com.example.playlistapp.databinding.FragmentPlayListBinding


class PlayListFragment : BindingFragment<FragmentPlayListBinding>(R.layout.fragment_play_list) {
    private val playListViewModel by viewModels<PlayListViewModel>()
    private val playListAdapter by lazy { PlayListAdapter() }

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
        binding.rvList.adapter = playListAdapter
        playListViewModel.getPlayList()
    }

    private fun subscribeData() {
        with(playListViewModel) {
            playList.observe(viewLifecycleOwner) { playListAdapter.submitList(it) }
        }
    }
}