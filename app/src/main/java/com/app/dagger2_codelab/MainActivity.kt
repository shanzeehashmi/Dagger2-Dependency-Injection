package com.app.dagger2_codelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.dagger2_codelab.ui.MainActivityViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        MyApplication.appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.title)

        mainActivityViewModel.repository.saveUserDetails("Zeeshan Hashmi")
        textView.text = mainActivityViewModel.repository.getUserDetails()

    }
}