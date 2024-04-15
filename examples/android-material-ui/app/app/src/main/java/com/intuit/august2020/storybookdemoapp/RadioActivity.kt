package com.intuit.august2020.storybookdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.intuit.august2020.storybookdemoapp.databinding.ActivityRadioBinding

class RadioActivity : AppCompatActivity() {

	private lateinit var binding: ActivityRadioBinding

	private fun updateRadioLabel(radio: RadioButton, key: String) {
		if (intent.hasExtra(key)) {
			val label = intent.getStringExtra(key)
			radio.text = label
		}
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityRadioBinding.inflate(layoutInflater)
		setContentView(binding.root)

		updateRadioLabel(binding.radioButton1, "label1")
		updateRadioLabel(binding.radioButton2, "label2")
		updateRadioLabel(binding.radioButton3, "label3")
		updateRadioLabel(binding.radioButton4, "label4")
		updateRadioLabel(binding.radioButton5, "label5")
	}
}
