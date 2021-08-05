package com.app.dagger2_codelab.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.app.dagger2_codelab.MyApplication
import com.app.dagger2_codelab.data.Constants
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext() : Application{
        return MyApplication.application
    }

    @Provides
    fun provideSharePref() : SharedPreferences{
            return MyApplication.application.getSharedPreferences(Constants.SHAREDPREFFLIE, Context.MODE_PRIVATE)
    }

}