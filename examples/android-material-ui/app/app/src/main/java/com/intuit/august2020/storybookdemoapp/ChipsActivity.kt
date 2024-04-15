package com.intuit.august2020.storybookdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.chip.Chip
import com.intuit.august2020.storybookdemoapp.databinding.ActivityChipsBinding

class ChipsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChipsBinding

    private fun updateChipText(chip: Chip, key: String) {
        if (intent.hasExtra(key)) {
            val title = intent.getStringExtra(key)
            chip.text = title
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChipsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateChipText(binding.chip1, "chip1")
        updateChipText(binding.chip2, "chip2")
        updateChipText(binding.chip3, "chip3")
        updateChipText(binding.chip4, "chip4")
    }
}
