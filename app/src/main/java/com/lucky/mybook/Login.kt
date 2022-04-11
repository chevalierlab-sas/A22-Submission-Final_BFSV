package com.lucky.mybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucky.mybook.databinding.LoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: LoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener{
            val intent =Intent(this@Login, MainActivity::class.java)
            startActivity(intent)
        }
    }
}