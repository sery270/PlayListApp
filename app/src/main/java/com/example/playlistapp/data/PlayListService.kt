package com.example.playlistapp.data

import com.example.playlistapp.base.BaseResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface PlayListService {

    @Headers("Content-Type:application/json")
    @GET("/config.json")
    suspend fun getPlayList(): BaseResponse<WrapperResponseSong>

    @Headers("Content-Type:application/json")
    @GET("/list.json")
    suspend fun getConfiguration(): BaseResponse<String>
}