package com.app.dagger2_codelab.ui

import androidx.lifecycle.ViewModel
import com.app.dagger2_codelab.data.Repository
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(val repository: Repository): ViewModel() {

}