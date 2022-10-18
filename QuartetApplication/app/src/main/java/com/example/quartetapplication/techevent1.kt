package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class techevent1 : AppCompatActivity() {
    private lateinit var canceltecheve1Button: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_techevent1)
        supportActionBar?.hide()
        canceltecheve1Button = findViewById(R.id.cancel)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }


        canceltecheve1Button.setOnClickListener {

            val intent = Intent(this, technical::class.java)

            startActivity(intent)
        }
    }
}