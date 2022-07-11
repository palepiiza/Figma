package com.example.projecttry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.projecttry.databinding.FragmentGuestBinding


class GuestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_guest, container, false)

        val binding: FragmentGuestBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_guest, container, false
        )
        binding.btnBack.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_guestFragment_to_homeFragment)
        )
        (activity as AppCompatActivity).supportActionBar!!.hide()

    return binding.root
    }

}