package com.khafidulmualif.myuas.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khafidulmualif.myuas.databinding.ActivityDetailCatatanBinding

class DetailCatatanActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailCatatanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailCatatanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}