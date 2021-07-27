package com.app.dagger2_codelab.di

import android.content.Context
import com.app.dagger2_codelab.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ContextModule {

    @Provides
    @Singleton
    fun provideApplication(): Context {
        return MyApplication.application
    }
}