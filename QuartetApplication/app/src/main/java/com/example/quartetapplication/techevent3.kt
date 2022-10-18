package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class techevent3 : AppCompatActivity() {
    private lateinit var canceltecheve3Button: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_techevent3)
        supportActionBar?.hide()
        canceltecheve3Button = findViewById(R.id.cancel)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }


        canceltecheve3Button.setOnClickListener {

            val intent = Intent(this, technical::class.java)

            startActivity(intent)
        }
    }
}