package com.app.dagger2_codelab.di

import com.app.dagger2_codelab.data.Storage
import javax.inject.Inject

/**
 * In SharedPrefModule we said the dagger that whenever it requires the SharedPreferenceStorage object it can create
 * and here we will say the dagger -> how to create the instance of it
 */
class SharedPreferenceStorage  @Inject constructor() : Storage()