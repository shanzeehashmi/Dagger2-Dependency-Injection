package com.app.dagger2_codelab.data

import android.content.SharedPreferences
import javax.inject.Inject

class Repository @Inject constructor(private val storage: Storage) {

    fun getUserDetails(): String? {
        return storage.getSharedPref().getString(Constants.USERNAME, "Not Available")
    }

    fun saveUserDetails(userName:String) {
        val editor:SharedPreferences.Editor = storage.getSharedPref().edit()
        editor.putString(Constants.USERNAME,userName);
        editor.apply()
    }

}