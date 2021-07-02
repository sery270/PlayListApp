package com.example.playlistapp.data

import retrofit2.http.GET
import retrofit2.http.Headers

interface PlayListService {

    @Headers("Content-Type:application/json")
    @GET("connectier-interview/list.json")
    suspend fun getPlayList(): List<ResponseSong>

    @Headers("Content-Type:application/json")
    @GET("connectier-interview/config.json")
    suspend fun getConfiguration(): String
}