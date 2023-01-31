package com.example.homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class FirstScreen : Fragment(R.layout.fragment_first_screen) {
    lateinit var controller: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        controller = findNavController()
        val button = view.findViewById<Button>(R.id.to_dog_page)
        button.setOnClickListener {
            controller.navigate(R.id.action_firstScreen_to_secondScreen)

        }
    }

    }
