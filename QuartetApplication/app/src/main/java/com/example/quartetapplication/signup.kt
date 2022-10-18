package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup : AppCompatActivity() {
    private lateinit var backhomeButton: Button
    private lateinit var signstudButton: Button
    private lateinit var signclubButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        supportActionBar?.hide()

        backhomeButton = findViewById(R.id.cancel)
        signstudButton = findViewById(R.id.studbtn)
        signclubButton = findViewById(R.id.clubbtn)


        backhomeButton.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)

            startActivity(intent)
        }

        signstudButton.setOnClickListener {

            val intent = Intent(this, signupstud::class.java)

            startActivity(intent)
        }
        signclubButton.setOnClickListener {

            val intent = Intent(this, signupclub::class.java)

            startActivity(intent)
        }

    }
}