package com.example.finaluri.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.finaluri.MainActivity
import com.example.finaluri.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private lateinit var textViewUsername : TextView
    private lateinit var buttonChangePassword2 : Button
    private lateinit var buttonLogout : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textViewUsername = view.findViewById(R.id.textViewUsername)
        buttonChangePassword2 = view.findViewById(R.id.buttonChangePassword2)
        buttonLogout = view.findViewById(R.id.buttonLogout)


        buttonLogout.setOnClickListener(){

            startActivity(Intent(activity,MainActivity::class.java))
            activity?.finish()
        }

    }
}