package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class festevent1 : AppCompatActivity() {
    private lateinit var cancelfesteve1Button: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_festevent1)
        supportActionBar?.hide()
        cancelfesteve1Button = findViewById(R.id.cancel)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }


        cancelfesteve1Button.setOnClickListener {

            val intent = Intent(this, Festival::class.java)

            startActivity(intent)
        }
    }
}