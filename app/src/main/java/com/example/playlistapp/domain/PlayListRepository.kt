package com.example.playlistapp.domain

import io.reactivex.rxjava3.core.Single

interface PlayListRepository {
    fun getPlayList(): Single<List<Song>>
}