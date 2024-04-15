package com.intuit.august2020.storybookdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.intuit.august2020.storybookdemoapp.databinding.ActivitySnackbarBinding

class SnackbarActivity : AppCompatActivity() {

	private lateinit var binding: ActivitySnackbarBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivitySnackbarBinding.inflate(layoutInflater)
		setContentView(binding.root)

		var title = "title"
		if (intent.hasExtra("title")) {
			title = intent.getStringExtra("title").orEmpty()
		}

		var action = "Action"
		if (intent.hasExtra("action")) {
			action = intent.getStringExtra("action").orEmpty()
		}

		Snackbar.make(binding.snackbar, title, Snackbar.LENGTH_INDEFINITE)
			.setAction(action) {
				// Responds to click on the action
			}
			.show()
	}
}
