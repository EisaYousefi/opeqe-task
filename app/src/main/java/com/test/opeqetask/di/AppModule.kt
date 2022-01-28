package com.test.opeqetask.di

import com.test.opeqetask.common.Constants
import com.test.opeqetask.data.remote.OpeqeApi
import com.test.opeqetask.data.repository.OpeqeReporitoryImpl
import com.test.opeqetask.domin.reposetory.OpeqeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOpeqeApi():OpeqeApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(OpeqeApi::class.java)
    }

    @Provides
    @Singleton
    fun provideOpeqeRepository(api: OpeqeApi):OpeqeRepository{
        return OpeqeReporitoryImpl(api)
    }
}