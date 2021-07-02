package com.example.playlistapp.data

interface PlayListDataSource {
    suspend fun getPlayList(): List<ResponseSong>
    suspend fun getConfiguration(): String
}