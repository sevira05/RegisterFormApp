package com.example.registerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.registerapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("FULLNAME") ?: "User"
        binding.tvWelcome.text = "Welcome, $name!"
    }
}
