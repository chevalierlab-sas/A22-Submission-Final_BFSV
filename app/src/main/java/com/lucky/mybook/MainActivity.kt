package com.lucky.mybook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.lucky.mybook.databinding.ActivityMainBinding
import com.lucky.mybook.ui.FragmentAbout
import com.lucky.mybook.ui.FragmentBook

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val FragmentAbout = FragmentAbout()
    private val FragmentBook = FragmentBook()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        currentPage(FragmentBook)

        binding.bottomNavigation.setOnItemSelectedListener { item ->
        when(item.itemId){
            R.id.page_1 -> {
                currentPage(FragmentBook)
            }
            R.id.page_2 -> {
                currentPage(FragmentAbout)
            }
        }
            true
        }
    }
    private fun currentPage(fragment : Fragment) = supportFragmentManager.beginTransaction().apply{
        replace(R.id.container, fragment)
        commit()
    }
}