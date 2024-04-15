package com.intuit.august2020.storybookdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intuit.august2020.storybookdemoapp.databinding.ActivityTextFieldBinding

class TextFieldActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTextFieldBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextFieldBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("helperText")) {
            val text = intent.getStringExtra("helperText")
            binding.textField.helperText = text
        }

        if (intent.hasExtra("placeholderText")) {
            val text = intent.getStringExtra("placeholderText")
            binding.textField.placeholderText = text
        }

        if (intent.hasExtra("hintText")) {
            val text = intent.getStringExtra("hintText")
            binding.textField.hint = text
        }
    }
}
