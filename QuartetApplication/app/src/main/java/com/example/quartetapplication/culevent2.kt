package com.example.quartetapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class culevent2 : AppCompatActivity() {
    private lateinit var cancelculeve2Button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culevent2)
        supportActionBar?.hide()
        cancelculeve2Button = findViewById(R.id.cancel)


        cancelculeve2Button.setOnClickListener {

            val intent = Intent(this, cultural::class.java)

            startActivity(intent)
        }
    }
}