package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class culevent3 : AppCompatActivity() {
    private lateinit var cancelculeve3Button: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culevent3)
        supportActionBar?.hide()

        cancelculeve3Button = findViewById(R.id.cancel)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }



        cancelculeve3Button.setOnClickListener {

            val intent = Intent(this, cultural::class.java)

            startActivity(intent)
        }
    }
}