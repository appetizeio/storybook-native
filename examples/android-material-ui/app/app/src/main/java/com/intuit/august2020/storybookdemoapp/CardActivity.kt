package com.intuit.august2020.storybookdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intuit.august2020.storybookdemoapp.databinding.ActivityCardBinding

class CardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("title")) {
            val title = intent.getStringExtra("title");
            binding.cardTitle.text = title;
        }

        if (intent.hasExtra("subtitle")) {
            val title = intent.getStringExtra("subtitle");
            binding.cardSubtitle.text = title;
        }

        if (intent.hasExtra("body")) {
            val title = intent.getStringExtra("body");
            binding.cardSupportingText.text = title;
        }

        if (intent.hasExtra("action1")) {
            val title = intent.getStringExtra("action1");
            binding.action1.text = title;
        }

        if (intent.hasExtra("action2")) {
            val title = intent.getStringExtra("action2");
            binding.action2.text = title;
        }
    }
}
