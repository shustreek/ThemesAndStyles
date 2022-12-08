package ru.alfa.themesandstyles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import ru.alfa.themesandstyles.databinding.ActivityMainBinding
import ru.alfa.themesandstyles.databinding.ActivitySimpleThemeBinding

class SimpleThemeActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySimpleThemeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivitySimpleThemeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.buttonFirst.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }


    }
}