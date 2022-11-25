package com.example.stenli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        supportActionBar?.hide()
    }

    fun Pindah(view: View) {
        val intent = android.content.Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
