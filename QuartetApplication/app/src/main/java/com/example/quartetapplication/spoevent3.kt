package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class spoevent3 : AppCompatActivity() {
    private lateinit var cancelspoeve3Button: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spoevent3)
        supportActionBar?.hide()
        cancelspoeve3Button = findViewById(R.id.cancel)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }

        cancelspoeve3Button.setOnClickListener {

            val intent = Intent(this, sport::class.java)

            startActivity(intent)
        }
    }
}