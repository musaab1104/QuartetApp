package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profile : AppCompatActivity() {
    private lateinit var backoptButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide()
        backoptButton = findViewById(R.id.cancel)

        backoptButton.setOnClickListener {

            val intent = Intent(this, Option::class.java)

            startActivity(intent)
        }
    }
}