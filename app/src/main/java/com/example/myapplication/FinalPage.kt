package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class FinalPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_page)
        val imgView = findViewById<ImageView>(R.id.imageView2)
        var ci = 0
        val imgArr = arrayOf(R.drawable.gbroad, R.drawable.google, R.drawable.nasa)
        val nextBtn = findViewById<Button>(R.id.button2)
        nextBtn.setOnClickListener{
            if (ci!=2){
                ci+=1
            }else{
                ci=0
            }
            val drawable =
            imgView.setImageResource(imgArr[ci])


        }
    }
}