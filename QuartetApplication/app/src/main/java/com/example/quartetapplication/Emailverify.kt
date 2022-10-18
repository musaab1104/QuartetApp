package com.example.quartetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Emailverify : AppCompatActivity() {
    private lateinit var verifyButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emailverify)
        supportActionBar?.hide()
        verifyButton = findViewById(R.id.verify)

        verifyButton.setOnClickListener {

            val intent = Intent(this, Newpass::class.java)

            startActivity(intent)
        }
    }
}