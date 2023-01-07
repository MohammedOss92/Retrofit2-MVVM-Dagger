package com.sarrawi.retrofitmvvm.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RetroModule {

    val baseURL = "https://api.github.com/search/"//repositories?q=newyork


    @Singleton
    @Provides
    fun getRetroServiceInterface(retrofit: Retrofit):RetroServiceInterface{
        return retrofit.create(RetroServiceInterface::class.java)
    }

    @Singleton
    @Provides
    fun getRetrofitInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}