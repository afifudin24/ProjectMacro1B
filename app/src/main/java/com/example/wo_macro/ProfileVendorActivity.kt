package com.example.wo_macro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileVendorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_vendor)
        val fragment = layananWoFragment.newInstance("test1", "test2")
        val bottom_navigation_view = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottom_navigation_view.setOnNavigationItemSelectedListener(menuItemSelected)
        addFragment(fragment)
    }

    private val menuItemSelected = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId){
            R.id.itemLayanan -> {
                val fragment = layananWoFragment.newInstance("test1", "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemPortfolio -> {
                val fragment = portfolioWoFragment.newInstance("test1", "test2")
                addFragment(fragment)
                println("kocak")
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemInfo -> {
                val fragment = infoWoFragment.newInstance("test1", "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                com.google.android.material.R.anim.design_bottom_sheet_slide_in,
                com.google.android.material.R.anim.design_bottom_sheet_slide_out
            )
            .replace(R.id.content, fragment, fragment.javaClass.simpleName) // Gunakan simpleName
            .commit() // Tambahkan ini untuk mengeksekusi perubahan
    }

}

