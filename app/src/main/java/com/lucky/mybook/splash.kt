package com.lucky.mybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.lucky.mybook.databinding.SplashBinding

@Suppress("DEPRECATION")
class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        Handler().postDelayed({
            val intent = Intent(this@splash, Login::class.java)
            startActivity(intent)

        }, 3000)
    }
}