package com.example.playlistapp.domain

interface PlayListRepository {
    suspend fun getPlayList(): List<Song>
}