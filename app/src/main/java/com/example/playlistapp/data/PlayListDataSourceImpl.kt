package com.example.playlistapp.data

import android.content.Context
import com.example.playlistapp.base.BaseResponse
import javax.inject.Inject

class PlayListDataSourceImpl @Inject constructor(
    private val context: Context
) : PlayListDataSource {
    override suspend fun fetchPlayList(): BaseResponse<WrapperResponseSong> {
//        return withContext(Dispatchers.IO){
//
//        }
        TODO()
    }
}