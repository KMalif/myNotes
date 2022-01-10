package com.khafidulmualif.myuas.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.khafidulmualif.myuas.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        moveToLogin()
    }
    private fun moveToLogin(){
        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java)).also { finish() }
        },3000)
    }
}