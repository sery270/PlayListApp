package com.example.playlistapp.di

import com.example.playlistapp.data.PlayListService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Provides
    @Singleton
    fun providePlayListService(retrofit: Retrofit): PlayListService =
        retrofit.create(PlayListService::class.java)
}