package com.example.playlistapp.di

import android.content.Context
import com.example.playlistapp.data.PlayListDataSource
import com.example.playlistapp.data.PlayListDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun providePlayListDataSource(@ApplicationContext context: Context): PlayListDataSource =
        PlayListDataSourceImpl(context)
}