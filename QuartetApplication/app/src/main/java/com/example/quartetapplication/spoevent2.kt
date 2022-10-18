package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class spoevent2 : AppCompatActivity() {
    private lateinit var canceltecheve2Button: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spoevent2)
        supportActionBar?.hide()
        canceltecheve2Button = findViewById(R.id.cancel)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }


        canceltecheve2Button.setOnClickListener {

            val intent = Intent(this, sport::class.java)

            startActivity(intent)
        }
    }
}