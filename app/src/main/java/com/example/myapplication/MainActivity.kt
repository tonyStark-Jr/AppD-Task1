package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userBox = findViewById<EditText>(R.id.editTextText)
        val passBox = findViewById<EditText>(R.id.editTextTextPassword)
        val signIn = findViewById<Button>(R.id.button)
        signIn.setOnClickListener{
            val userData : String = userBox.text.toString()
            val userPass : String = userBox.text.toString()
            if (userData.isEmpty() && userPass.isEmpty()){
                Toast.makeText(this, "User Details not Found", Toast.LENGTH_SHORT).show()
            }else{
            val change = Intent(this, FinalPage::class.java)
            startActivity(change)
            }
        }





            }
}