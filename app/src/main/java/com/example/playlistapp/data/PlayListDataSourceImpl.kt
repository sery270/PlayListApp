package com.example.playlistapp.data

import javax.inject.Inject

class PlayListDataSourceImpl @Inject constructor(
    private val service: PlayListService
) : PlayListDataSource {
    override suspend fun getPlayList(): List<ResponseSong> = service.getPlayList()
    override suspend fun getConfiguration(): String = service.getConfiguration()
}