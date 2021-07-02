package com.example.playlistapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.playlistapp.domain.PlayListRepository
import com.example.playlistapp.domain.Song
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PlayListViewModel @Inject constructor(
    private val playListRepository: PlayListRepository
) : ViewModel() {
    private val _playList = MutableLiveData<List<Song>>()
    val playList: LiveData<List<Song>>
        get() = _playList

    fun getPlayList() {
        viewModelScope.launch {
            runCatching { playListRepository.getPlayList() }
                .onSuccess { _playList.value = it }
                .onFailure { it.printStackTrace() }
        }
    }
}