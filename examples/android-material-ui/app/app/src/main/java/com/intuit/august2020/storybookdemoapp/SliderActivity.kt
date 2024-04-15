package com.intuit.august2020.storybookdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.slider.Slider
import com.intuit.august2020.storybookdemoapp.databinding.ActivitySliderBinding
import java.text.NumberFormat
import java.util.*

class SliderActivity : AppCompatActivity() {

	private lateinit var binding: ActivitySliderBinding
	private fun updateMinValue(slider: Slider, key: String) {
		if (intent.hasExtra(key)) {
			val value = intent.getStringExtra(key).orEmpty()
			slider.valueFrom = value.toFloat()
		}
	}

	private fun updateMaxValue(slider: Slider, key: String) {
		if (intent.hasExtra(key)) {
			val value = intent.getStringExtra(key).orEmpty()
			slider.valueTo = value.toFloat()
		}
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivitySliderBinding.inflate(layoutInflater)
		setContentView(binding.root)

		updateMinValue(binding.rangeSlider, "rangeMin")
		updateMaxValue(binding.rangeSlider, "rangeMax")

		binding.rangeSlider.setLabelFormatter { value: Float ->
			val format = NumberFormat.getCurrencyInstance()
			format.maximumFractionDigits = 0
			format.currency = Currency.getInstance("USD")
			format.format(value.toDouble())
		}
	}
}
