package com.example.playlistapp.data

import com.example.playlistapp.base.BaseResponse
import javax.inject.Inject

class PlayListDataSourceImpl @Inject constructor(
    private val service: PlayListService
) : PlayListDataSource {
    override suspend fun getPlayList(): BaseResponse<WrapperResponseSong> = service.getPlayList()
    override suspend fun getConfiguration(): BaseResponse<String> = service.getConfiguration()
}