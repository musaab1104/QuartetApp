package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class festevent3 : AppCompatActivity() {
    private lateinit var cancelfesteve3Button: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_festevent3)
        supportActionBar?.hide()
        cancelfesteve3Button = findViewById(R.id.cancel)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }


        cancelfesteve3Button.setOnClickListener {

            val intent = Intent(this, Festival::class.java)

            startActivity(intent)
        }
    }
}