package com.app.dagger2_codelab.data

import android.content.SharedPreferences
import javax.inject.Inject

class Repository @Inject constructor(private val storage: SharedPreferences) {

    fun getUserDetails(): String? {
        return storage.getString(Constants.USERNAME, "Not Available")
    }

    fun saveUserDetails(userName:String) {
        val editor:SharedPreferences.Editor = storage.edit()
        editor.putString(Constants.USERNAME,userName);
        editor.apply()
    }

}