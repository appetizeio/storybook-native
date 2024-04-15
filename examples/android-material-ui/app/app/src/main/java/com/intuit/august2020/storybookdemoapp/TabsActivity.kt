package com.intuit.august2020.storybookdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.intuit.august2020.storybookdemoapp.databinding.ActivityTabsBinding

class TabsActivity : AppCompatActivity() {

	private lateinit var binding: ActivityTabsBinding
	private fun updateTabLabel(index: Int, key: String) {
		val tab: TabLayout.Tab = binding.tabLayout.getTabAt(index) ?: return

		if (intent.hasExtra(key)) {
			val label = intent.getStringExtra(key)
			tab.text = label
		}
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityTabsBinding.inflate(layoutInflater)
		setContentView(binding.root)

		updateTabLabel(0, "label1")
		updateTabLabel(1, "label2")
		updateTabLabel(2, "label3")
	}
}
