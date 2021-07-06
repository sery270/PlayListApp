package com.example.playlistapp.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Song(
    val title: String,
    val artist: String,
    val image_url: String,
    val audio_url: String
) : Parcelable