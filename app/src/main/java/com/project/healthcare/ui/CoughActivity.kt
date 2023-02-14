package com.project.healthcare.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.healthcare.R
import com.project.healthcare.databinding.ActivityCoughBinding

class CoughActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCoughBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoughBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}