package com.app.dagger2_codelab

import android.app.Application
import com.app.dagger2_codelab.di.AppComponent
import com.app.dagger2_codelab.di.DaggerAppComponent

class MyApplication:Application() {

    companion object{

        // Instance of the AppComponent that will be used by all the Activities in the project
         val appComponent: AppComponent  = DaggerAppComponent.builder()
            .build()

        lateinit var application:Application
    }

    override fun onCreate() {
        super.onCreate()
        application = this
    }

}