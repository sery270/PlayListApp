package com.example.playlistapp.di

import com.example.playlistapp.data.PlayListDataSource
import com.example.playlistapp.data.PlayListDataSourceImpl
import com.example.playlistapp.data.PlayListService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun providePlayListDataSource(playListService: PlayListService): PlayListDataSource =
        PlayListDataSourceImpl(playListService)
}