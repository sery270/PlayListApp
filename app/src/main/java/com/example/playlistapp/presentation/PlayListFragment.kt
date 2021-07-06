package com.example.playlistapp.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.playlistapp.R
import com.example.playlistapp.base.BindingFragment
import com.example.playlistapp.databinding.FragmentPlayListBinding
import com.example.playlistapp.domain.Song
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class PlayListFragment : BindingFragment<FragmentPlayListBinding>(R.layout.fragment_play_list) {
    private val playListViewModel by viewModels<PlayListViewModel>()
    private lateinit var playListAdapter : PlayListAdapter

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
        playListAdapter = PlayListAdapter(onClick = {onClick(it)})
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

    private fun onClick(song: Song) {
        Log.d("asdf",song.toString())
        findNavController().navigate(PlayListFragmentDirections.actionPlayListFragmentToDetailFragment(song))
    }
}