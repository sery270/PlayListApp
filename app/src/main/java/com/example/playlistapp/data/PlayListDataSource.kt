package com.example.playlistapp.data

import com.example.playlistapp.base.BaseResponse

interface PlayListDataSource {
    suspend fun fetchPlayList(): BaseResponse<WrapperResponseSong>
}