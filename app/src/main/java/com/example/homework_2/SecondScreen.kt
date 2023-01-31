package com.example.homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class SecondScreen : Fragment(R.layout.fragment_second_screen4) {
    lateinit var controller: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        controller = findNavController()
        val button = view.findViewById<Button>(R.id.tocatpage)
        button.setOnClickListener {
            controller.navigate(R.id.action_secondScreen_to_firstScreen)


        }
    }



}