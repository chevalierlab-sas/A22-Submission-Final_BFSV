package com.lucky.mybook.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lucky.mybook.databinding.FragmentAboutBinding

class FragmentAbout : Fragment() {

    private lateinit var binding: FragmentAboutBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}