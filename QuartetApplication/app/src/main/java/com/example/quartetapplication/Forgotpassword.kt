package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Forgotpassword : AppCompatActivity() {
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)
        supportActionBar?.hide()


        nextButton = findViewById(R.id.next)

        nextButton.setOnClickListener {

            val intent = Intent(this, Emailverify::class.java)

            startActivity(intent)
        }
    }
}