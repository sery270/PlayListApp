package com.example.playlistapp.data

import com.example.playlistapp.base.BaseResponse
import com.example.playlistapp.domain.Song

interface PlayListDataSource {
    suspend fun getPlayList(): BaseResponse<WrapperResponseSong>
    suspend fun getConfiguration(): BaseResponse<String>
}