package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cultural : AppCompatActivity() {
    private lateinit var cancelculButton: Button
    private lateinit var event1culButton: Button
    private lateinit var event2culButton: Button
    private lateinit var event3culButton: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cultural)
        supportActionBar?.hide()
        cancelculButton = findViewById(R.id.cancel)
        event1culButton = findViewById(R.id.cul_event1)
        event2culButton = findViewById(R.id.cul_event2)
        event3culButton = findViewById(R.id.cul_event3)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }

        cancelculButton.setOnClickListener {

            val intent = Intent(this, Option::class.java)

            startActivity(intent)
        }

        event1culButton.setOnClickListener {

            val intent = Intent(this, culevent1::class.java)

            startActivity(intent)
        }
        event2culButton.setOnClickListener {

            val intent = Intent(this, culevent2::class.java)

            startActivity(intent)
        }
        event3culButton.setOnClickListener {

            val intent = Intent(this, culevent3::class.java)

            startActivity(intent)
        }
    }
}