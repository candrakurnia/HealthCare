package com.project.healthcare.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.healthcare.R
import com.project.healthcare.adapter.CoughAdapter
import com.project.healthcare.databinding.ActivityCoughBinding

class CoughActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCoughBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoughBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

    }

    private fun init(){
        recyclerView = binding.rvCough
        recyclerView.layoutManager = GridLayoutManager(this@CoughActivity,2)
        recyclerView.adapter = CoughAdapter()
        recyclerView.setHasFixedSize(true)
    }
}