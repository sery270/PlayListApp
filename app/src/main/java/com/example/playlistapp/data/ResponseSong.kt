package com.example.playlistapp.data

import com.example.playlistapp.di.RetrofitModule.BASE_URL
import com.example.playlistapp.domain.Song
import com.google.gson.annotations.SerializedName

data class WrapperResponseSong(
    @SerializedName("playList")
    val responseSongList: List<ResponseSong>
)

data class ResponseSong(
    @SerializedName("title")
    val title: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("audio_url")
    val audio_url: String,

    @SerializedName("image_url")
    val image_url: String,

    @SerializedName("updated_at")
    val updated_at: String,

    @SerializedName("user_id")
    val user_id: Int

) {
    fun toSong(): Song {
        return Song(
            title = title,
            artist = description,
//            BASE_URL이 /로 끝나는데, image_url도 /로 시작하므로 image_url의 맨 앞 문자열 하나 삭제
            image_url = BASE_URL + image_url.substring(1),
            audio_url = audio_url
        )
    }
}