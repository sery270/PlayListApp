package com.example.playlistapp.data

import retrofit2.http.GET
import retrofit2.http.Headers

interface PlayListService {

    @Headers("Content-Type:application/json")
    @GET("list.json")
    suspend fun getPlayList(): List<ResponseSong>

    @Headers("Content-Type:application/json")
    @GET("config.json")
    suspend fun getConfiguration(): String
}