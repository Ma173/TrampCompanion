package com.example.trampcompanion

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.trampcompanion.ui.main.SectionsPagerAdapter
import com.example.trampcompanion.databinding.ActivityMainBinding
import com.example.trampcompanion.ui.main.ScreenSlidePageFragment1
import com.example.trampcompanion.ui.main.ScreenSlidePageFragment2

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        sectionsPagerAdapter.addFragment(ScreenSlidePageFragment1())
        sectionsPagerAdapter.addFragment(ScreenSlidePageFragment2())

        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
        val btnNextExercise: FloatingActionButton = binding.btnNextExercise

        btnNextExercise.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

}