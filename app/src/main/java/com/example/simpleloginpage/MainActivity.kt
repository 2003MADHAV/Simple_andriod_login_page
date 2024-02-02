package com.example.simpleloginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import java.net.PasswordAuthentication
import android.view.View
import android.widget.TextView
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button
    private lateinit var textViewResult: TextView
    private lateinit var imageViewFacebook: ImageView
    private lateinit var imageViewLinkedIn: ImageView
    private lateinit var imageViewInstagram: ImageView
    private lateinit var imageViewGoogle: ImageView
    private lateinit var imageViewGitHub: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)
        textViewResult = findViewById(R.id.textViewResult)
        imageViewFacebook = findViewById(R.id.imageViewFacebook)
        imageViewLinkedIn = findViewById(R.id.imageViewLinkedIn)
        imageViewInstagram = findViewById(R.id.imageViewInstagram)
        imageViewGoogle = findViewById(R.id.imageViewGoogle)
        imageViewGitHub = findViewById(R.id.imageViewGitHub)

        // Set onClickListener for the login button
        buttonLogin.setOnClickListener {
            login()
        }
    }

    private fun login() {
        val username = editTextUsername.text.toString()
        val password = editTextPassword.text.toString()

        // Check if username and password match hardcoded values
        if (username == "user" && password == "password") {
            textViewResult.text = "Login successful!"
        } else {
            textViewResult.text = "Invalid username or password."
        }
    }
    // Handle click events for social media icons
    fun onFacebookClick(view: View) {
        // Add your logic for Facebook login here
    }

    fun onLinkedInClick(view: View) {
        // Add your logic for LinkedIn login here
    }

    fun onInstagramClick(view: View) {
        // Add your logic for Instagram login here
    }

    fun onGoogleClick(view: View) {
        // Add your logic for Google login here
    }

    fun onGitHubClick(view: View) {
        // Add your logic for GitHub login here
    }
}
