package com.mahmudul.openai_dall_e_2.di

import com.mahmudul.openai_dall_e_2.data.source.DallEService
import com.mahmudul.openai_dall_e_2.data.source.RemoteDateSourceImpl
import com.mahmudul.openai_dall_e_2.domain.source.RemoteDataSource
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
    fun provideRemoteDateSource(remoteService: DallEService): RemoteDataSource =
        RemoteDateSourceImpl(remoteService)
}