package com.khafidulmualif.myuas.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khafidulmualif.myuas.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}