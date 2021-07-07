package com.example.playlistapp.data

import com.example.playlistapp.domain.PlayListRepository
import com.example.playlistapp.domain.Song
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class PlayListRepositoryImpl @Inject constructor(
    private val playListDataSource: PlayListDataSource
) : PlayListRepository {
    override fun getPlayList(): Single<List<Song>> =
        playListDataSource.getPlayList().subscribeOn(Schedulers.io())
            .map { list ->
                list.map { it.toSong() }
            }
            .observeOn(AndroidSchedulers.mainThread())
}