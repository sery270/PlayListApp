package com.example.playlistapp.data

import io.reactivex.rxjava3.core.Single

interface PlayListDataSource {
    fun getPlayList(): Single<List<ResponseSong>>
    suspend fun getConfiguration(): String
}