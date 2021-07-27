package com.app.dagger2_codelab.di

import com.app.dagger2_codelab.data.Storage
import dagger.Binds
import dagger.Module


@Module
abstract class SharedPrefModule {

    //from this abstract method we are telling dagger, whenever it needs SharedPreference object get it from here
    @Binds
    abstract fun provideSharedPref(storage: SharedPreferenceStorage): Storage

}