package com.example.quartetapplication

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.quartetapplication.databinding.ActivitySignupstudBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.sql.Ref
import java.util.jar.Attributes.Name

class signupstud : AppCompatActivity() {
    private lateinit var backsignupButton: Button
    private lateinit var signupButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupstud)
        supportActionBar?.hide()
        signupButton = findViewById(R.id.signup)

        signupButton.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)

            startActivity(intent)
        }

       backsignupButton = findViewById(R.id.cancel)

        backsignupButton.setOnClickListener {

            val intent = Intent(this, signup::class.java)

            startActivity(intent)
        }
    }
}