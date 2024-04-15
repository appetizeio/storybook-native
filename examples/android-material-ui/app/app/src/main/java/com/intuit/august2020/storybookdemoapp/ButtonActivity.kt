package com.intuit.august2020.storybookdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intuit.august2020.storybookdemoapp.databinding.ActivityButtonBinding

class ButtonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("label")) {
            val label = intent.getStringExtra("label");
            binding.textButton.text = label
            binding.outlinedButton.text = label
            binding.containedButton.text = label
        }
    }
}
