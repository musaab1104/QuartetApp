package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class spoevent1 : AppCompatActivity() {
    private lateinit var cancelspoeve1Button: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spoevent1)
        supportActionBar?.hide()
        cancelspoeve1Button = findViewById(R.id.cancel)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }


        cancelspoeve1Button.setOnClickListener {

            val intent = Intent(this, sport::class.java)

            startActivity(intent)
        }
    }
}