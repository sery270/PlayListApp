package com.example.playlistapp.data

import com.example.playlistapp.domain.PlayListRepository
import com.example.playlistapp.domain.Song
import javax.inject.Inject

class PlayListRepositoryImpl @Inject constructor(
    private val playListDataSource: PlayListDataSource
) : PlayListRepository {
    override suspend fun getPlayList(): List<Song> =
        playListDataSource.getPlayList().map { it.toSong() }
}