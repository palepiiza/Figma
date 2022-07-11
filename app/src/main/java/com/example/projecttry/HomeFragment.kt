package com.example.projecttry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.projecttry.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        val binding: FragmentHomeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false)

        (activity as AppCompatActivity).supportActionBar!!.hide()

        binding.btnEvent.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_eventFragment)
        )

        binding.btnGuest.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_guestFragment)
        )
        binding.btnBack2.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_introFragment)
        )

        return binding.root
    }
}