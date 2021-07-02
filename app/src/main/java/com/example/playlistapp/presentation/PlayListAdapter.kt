package com.example.playlistapp.presentation

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.playlistapp.R
import com.example.playlistapp.databinding.ItemSongBinding
import com.example.playlistapp.domain.Song

class PlayListAdapter : ListAdapter<Song, PlayListAdapter.SongHolder>(DiffCallback) {

    class SongHolder(private val binding: ItemSongBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Song) {
            binding.song = item
            Log.d("dfdf","${item}")
        }
    }

    object DiffCallback : DiffUtil.ItemCallback<Song>() {
        override fun areItemsTheSame(oldItem: Song, newItem: Song): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: Song,
            newItem: Song
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ItemSongBinding =
            DataBindingUtil.inflate(inflater, R.layout.item_song, parent, false)
        return SongHolder(binding)
    }

    override fun onBindViewHolder(holder: SongHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
