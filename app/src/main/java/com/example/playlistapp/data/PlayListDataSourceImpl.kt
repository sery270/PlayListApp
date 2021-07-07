package com.example.playlistapp.data

import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class PlayListDataSourceImpl @Inject constructor(
    private val service: PlayListService
) : PlayListDataSource {
    override fun getPlayList(): Single<List<ResponseSong>> = service.getPlayList()
    override suspend fun getConfiguration(): String = service.getConfiguration()
}