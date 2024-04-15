package com.intuit.august2020.storybookdemoapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intuit.august2020.storybookdemoapp.databinding.ActivityFloatingButtonBinding

class FloatingButtonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFloatingButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFloatingButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("rippleColor")) {
            val colourHex = "#" + intent.getStringExtra("rippleColor")
            val colour = Color.parseColor(colourHex)
            binding.floatingActionButton.rippleColor = colour
        }
    }
}
