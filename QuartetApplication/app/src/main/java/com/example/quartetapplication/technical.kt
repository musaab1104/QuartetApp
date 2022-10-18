package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class technical : AppCompatActivity() {
    private lateinit var canceltechButton: Button
    private lateinit var event1techButton: Button
    private lateinit var event2techButton: Button
    private lateinit var event3techButton: Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technical)
        supportActionBar?.hide()

        canceltechButton = findViewById(R.id.cancel)
        event1techButton = findViewById(R.id.tech_event1)
        event2techButton = findViewById(R.id.tech_event2)
        event3techButton = findViewById(R.id.tech_event3)
        profileButton = findViewById(R.id.profile)

        profileButton.setOnClickListener {

            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }


        canceltechButton.setOnClickListener {

            val intent = Intent(this, Option::class.java)

            startActivity(intent)
        }
        event1techButton.setOnClickListener {

            val intent = Intent(this, techevent1::class.java)

            startActivity(intent)
        }
        event2techButton.setOnClickListener {

            val intent = Intent(this, techevent2::class.java)

            startActivity(intent)
        }
        event3techButton.setOnClickListener {

            val intent = Intent(this, techevent3::class.java)

            startActivity(intent)
        }

    }
}