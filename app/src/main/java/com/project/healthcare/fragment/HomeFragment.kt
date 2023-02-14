package com.project.healthcare.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.project.healthcare.R
import com.project.healthcare.databinding.FragmentHomeBinding
import com.project.healthcare.ui.CoughActivity
import com.project.healthcare.ui.LoginActivity
import com.project.healthcare.ui.PencernaanActivity

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding =FragmentHomeBinding.bind(view)


        binding.apply {
            cardBtn.setOnClickListener {
                startActivity(Intent(context, CoughActivity::class.java))
            }

            cardBtn2.setOnClickListener {
                startActivity(Intent(context, PencernaanActivity::class.java))
            }

            cardBtn3.setOnClickListener {
                startActivity(Intent(context, PencernaanActivity::class.java))
            }

            cardBtn4.setOnClickListener {
                startActivity(Intent(context, PencernaanActivity::class.java))
            }

            cardBtn5.setOnClickListener {
                startActivity(Intent(context, PencernaanActivity::class.java))
            }
            cardBtn6.setOnClickListener {
                startActivity(Intent(context, PencernaanActivity::class.java))
            }
        }


    }

}