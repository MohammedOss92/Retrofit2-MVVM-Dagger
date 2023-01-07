package com.sarrawi.retrofitmvvm.di

import com.sarrawi.retrofitmvvm.model.RecyclerList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroServiceInterface {

    @GET("repositories")
    fun getDataFromApi(@Query("q")query:String): Call<RecyclerList>?
}