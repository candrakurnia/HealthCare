package com.project.healthcare.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.healthcare.databinding.ItemCoughBinding

class CoughAdapter : RecyclerView.Adapter<CoughAdapter.ViewHolder>() {
    inner class ViewHolder(binding: ItemCoughBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemCoughBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ViewHolder((view))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
//        viewHolder.bind(list[position])
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}