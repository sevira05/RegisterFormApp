package com.example.registerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.registerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Contoh penggunaan: ambil teks dari EditText saat tombol diklik
        binding.btnRegister.setOnClickListener {
            val namaLengkap = binding.etFullName.text.toString()
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()
            val confirmPassword = binding.etConfirmPassword.text.toString()

            // Tambahkan logika validasi atau intent ke Login/HomeActivity
        }
    }
}
