package com.sarrawi.retrofitmvvm

import android.app.Application
import com.sarrawi.retrofitmvvm.di.DaggerRetroComponent
import com.sarrawi.retrofitmvvm.di.RetroComponent
import com.sarrawi.retrofitmvvm.di.RetroModule

class MyApplication : Application() {

    private lateinit var retroComponent: RetroComponent

    override fun onCreate() {
        super.onCreate()

        retroComponent = DaggerRetroComponent.builder()
            .retroModule(RetroModule())
            .build()
    }

    fun getRetroComponent(): RetroComponent {
        return retroComponent
    }
}