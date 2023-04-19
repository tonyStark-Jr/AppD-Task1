package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val SPLASH_DELAY = 3000
        Handler().postDelayed({
            // Start the main activity after the delay
            val intent = Intent(this@splash, MainActivity::class.java)
            startActivity(intent)
            finish() // finish the splash activity so that the user can't go back to it
        }, 3000)
    }
}