package com.khafidulmualif.myuas.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khafidulmualif.myuas.databinding.ActivityAddNotesBinding

class AddNotesActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAddNotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}