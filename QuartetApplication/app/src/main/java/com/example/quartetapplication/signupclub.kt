package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signupclub : AppCompatActivity() {
    private lateinit var backsignupButton: Button
    private lateinit var signupButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupclub)
        supportActionBar?.hide()

        backsignupButton = findViewById(R.id.cancel)
        signupButton = findViewById(R.id.signup)

        signupButton.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)

            startActivity(intent)
        }


        backsignupButton.setOnClickListener {

                val intent = Intent(this, signup::class.java)

                startActivity(intent)
            }
        }
    }