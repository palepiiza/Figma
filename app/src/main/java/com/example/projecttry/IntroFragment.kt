package com.example.projecttry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.projecttry.databinding.FragmentIntroBinding


class IntroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentIntroBinding = DataBindingUtil.inflate(
        inflater, R.layout.fragment_intro, container, false)

        (activity as AppCompatActivity).supportActionBar!!.hide()


        binding.btnLogin.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_introFragment_to_homeFragment)
        )

        return binding.root
    }

}