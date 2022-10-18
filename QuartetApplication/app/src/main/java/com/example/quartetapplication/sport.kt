package com.example.quartetapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sport : AppCompatActivity() {
    private lateinit var cancelspoButton: Button
    private lateinit var event1spoButton: Button
    private lateinit var event2spoButton: Button
    private lateinit var event3spoButton: Button
    private lateinit var profileButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport)
        supportActionBar?.hide()
        cancelspoButton = findViewById(R.id.cancel)
        event1spoButton = findViewById(R.id.spo_event1)
        event2spoButton = findViewById(R.id.spo_event2)
        event3spoButton = findViewById(R.id.spo_event3)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }


        cancelspoButton.setOnClickListener {

            val intent = Intent(this, Option::class.java)

            startActivity(intent)
        }

        event1spoButton.setOnClickListener {

            val intent = Intent(this, spoevent1::class.java)

            startActivity(intent)
        }
        event2spoButton.setOnClickListener {

            val intent = Intent(this, spoevent2::class.java)

            startActivity(intent)
        }
        event3spoButton.setOnClickListener {

            val intent = Intent(this, spoevent3::class.java)

            startActivity(intent)
        }

    }
}