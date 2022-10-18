package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Festival : AppCompatActivity() {
    private lateinit var cancelfestButton: Button
    private lateinit var event1festButton: Button
    private lateinit var event2festButton: Button
    private lateinit var event3festButton: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_festival)
        supportActionBar?.hide()
        cancelfestButton = findViewById(R.id.cancel)
        event1festButton = findViewById(R.id.fest_event1)
        event2festButton = findViewById(R.id.fest_event2)
        event3festButton = findViewById(R.id.fest_event3)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }


        cancelfestButton.setOnClickListener {

            val intent = Intent(this, Option::class.java)

            startActivity(intent)
        }

        event1festButton.setOnClickListener {

            val intent = Intent(this, festevent1::class.java)

            startActivity(intent)
        }
        event2festButton.setOnClickListener {

            val intent = Intent(this, festevent2::class.java)

            startActivity(intent)
        }
        event3festButton.setOnClickListener {

            val intent = Intent(this, festevent3::class.java)

            startActivity(intent)
        }
    }
}