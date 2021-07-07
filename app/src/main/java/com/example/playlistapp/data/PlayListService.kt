package com.example.playlistapp.data

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Headers

interface PlayListService {

    @Headers("Content-Type:application/json")
    @GET("list.json")
    fun getPlayList(): Single<List<ResponseSong>>

    @Headers("Content-Type:application/json")
    @GET("config.json")
    suspend fun getConfiguration(): String
}