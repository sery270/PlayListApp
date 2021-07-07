package com.example.playlistapp.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.playlistapp.base.BaseViewModel
import com.example.playlistapp.domain.PlayListRepository
import com.example.playlistapp.domain.Song
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PlayListViewModel @Inject constructor(
    private val playListRepository: PlayListRepository
) : BaseViewModel() {
    private val _playList = MutableLiveData<List<Song>>()
    val playList: LiveData<List<Song>>
        get() = _playList

    fun getPlayList() {
        addDisposable(
            playListRepository.getPlayList()
                .subscribe({
                    _playList.postValue(it)
                }, { Log.e("dfdf", "getPlayList", it) })
        )
    }
}