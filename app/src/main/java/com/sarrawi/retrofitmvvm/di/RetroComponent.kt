package com.sarrawi.retrofitmvvm.di

import com.sarrawi.retrofitmvvm.MainActivityViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules =  [RetroModule::class ])
interface RetroComponent {

    fun inject(mainActivityViewModel: MainActivityViewModel)
}