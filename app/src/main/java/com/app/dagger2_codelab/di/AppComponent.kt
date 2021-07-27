package com.app.dagger2_codelab.di

import com.app.dagger2_codelab.MainActivity
import dagger.Component

@Component(modules = [SharedPrefModule::class])
interface AppComponent {
    fun inject(activity:MainActivity)
}