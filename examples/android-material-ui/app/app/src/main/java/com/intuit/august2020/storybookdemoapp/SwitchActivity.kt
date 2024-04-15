package com.intuit.august2020.storybookdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.switchmaterial.SwitchMaterial
import com.intuit.august2020.storybookdemoapp.databinding.ActivitySwitchBinding

class SwitchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySwitchBinding

    private fun updateSwitchLabel(switch: SwitchMaterial, key: String) {
        if (intent.hasExtra(key)) {
            val label = intent.getStringExtra(key)
            switch.text = label
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwitchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateSwitchLabel(binding.switchMaterial, "label1")
        updateSwitchLabel(binding.switchMaterial2, "label2")
        updateSwitchLabel(binding.switchMaterial3, "label3")
        updateSwitchLabel(binding.switchMaterial4, "label4")
        updateSwitchLabel(binding.switchMaterial5, "label5")

        if (intent.hasExtra("enableLastSwitch")) {
            val enabled = intent.getStringExtra("enableLastSwitch").toBoolean()
            binding.switchMaterial5.isEnabled = enabled
        }
    }
}
