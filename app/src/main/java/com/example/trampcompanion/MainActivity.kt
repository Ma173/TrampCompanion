package com.example.trampcompanion

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import com.example.trampcompanion.ui.main.SectionsPagerAdapter
import com.example.trampcompanion.databinding.ActivityMainBinding
import com.example.trampcompanion.ui.main.fragments.*
import com.example.trampcompanion.ui.main.fragments.adapters.ViewPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()

    }

    private fun setUpTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FavoritesFragment(),"Einstellungen")
        adapter.addFragment(HomeFragment(), "Übungen")
        adapter.addFragment(JumptimerFragment(),"Sprung-Timer")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_favorite_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_add_road_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_emoji_people_24)

    }

}