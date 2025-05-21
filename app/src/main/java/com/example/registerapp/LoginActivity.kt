package com.example.registerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.registerapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private var correctUsername = ""
    private var correctPassword = ""
    private var fullName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        correctUsername = intent.getStringExtra("USERNAME") ?: ""
        correctPassword = intent.getStringExtra("PASSWORD") ?: ""
        fullName = intent.getStringExtra("FULLNAME") ?: ""

        binding.btnLogin.setOnClickListener {
            val inputUser = binding.etLoginUsername.text.toString()
            val inputPass = binding.etLoginPassword.text.toString()

            if (inputUser == correctUsername && inputPass == correctPassword) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("FULLNAME", fullName)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
