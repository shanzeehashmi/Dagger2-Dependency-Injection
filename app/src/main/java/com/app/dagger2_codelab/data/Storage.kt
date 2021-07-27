package com.app.dagger2_codelab.data

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.app.dagger2_codelab.MyApplication

open class Storage {

    fun getSharedPref():SharedPreferences{
        return MyApplication.application.getSharedPreferences(Constants.SHAREDPREFFLIE,MODE_PRIVATE)
    }

}