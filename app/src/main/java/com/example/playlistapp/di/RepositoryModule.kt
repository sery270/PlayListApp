package com.example.playlistapp.di

import com.example.playlistapp.data.PlayListDataSource
import com.example.playlistapp.data.PlayListRepositoryImpl
import com.example.playlistapp.domain.PlayListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun providePlayListRepository(playListDataSource: PlayListDataSource): PlayListRepository =
        PlayListRepositoryImpl(playListDataSource)
}