package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Option : AppCompatActivity() {
    private lateinit var culoptionButton: Button
    private lateinit var techoptionButton: Button
    private lateinit var festoptionButton: Button
    private lateinit var spooptionButton: Button
    private lateinit var profileButton: Button
    private lateinit var canceloptionButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)
        supportActionBar?.hide()
        culoptionButton = findViewById(R.id.cul_next)
        techoptionButton = findViewById(R.id.tech_next)
        spooptionButton = findViewById(R.id.sport_next)
        festoptionButton = findViewById(R.id.fest_next)
        profileButton = findViewById(R.id.profile)
        canceloptionButton = findViewById(R.id.cancel)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }

        culoptionButton.setOnClickListener {

            val intent = Intent(this, cultural::class.java)

            startActivity(intent)
        }

        techoptionButton.setOnClickListener {

            val intent = Intent(this, technical::class.java)

            startActivity(intent)
        }

        festoptionButton.setOnClickListener {

            val intent = Intent(this, Festival::class.java)

            startActivity(intent)
        }

        spooptionButton.setOnClickListener {

            val intent = Intent(this, sport::class.java)

            startActivity(intent)
        }


        canceloptionButton.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)

            startActivity(intent)
        }
    }
}