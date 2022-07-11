package com.example.projecttry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.projecttry.databinding.FragmentEventBinding


class EventFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_event, container, false)

        val binding: FragmentEventBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_event, container, false
        )

        binding.btnBack3.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_eventFragment_to_homeFragment)
        )
        (activity as AppCompatActivity).supportActionBar!!.hide()

        return binding.root
    }
}