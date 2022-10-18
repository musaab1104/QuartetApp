package com.example.quartetapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {


    private lateinit var androidlyButton: Button
    private lateinit var androidButton: Button
    private lateinit var forgotButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()


        androidButton = findViewById(R.id.signup)
        androidlyButton = findViewById(R.id.LoginBtn)
        forgotButton = findViewById(R.id.forget)

        forgotButton.setOnClickListener {

            val intent = Intent(this, Forgotpassword::class.java)

            startActivity(intent)
        }

        androidlyButton.setOnClickListener {

            val intent = Intent(this, Option::class.java)

            startActivity(intent)
        }
        androidButton.setOnClickListener {

            val intent = Intent(this, signup::class.java)

            startActivity(intent)
        }
    }
}




