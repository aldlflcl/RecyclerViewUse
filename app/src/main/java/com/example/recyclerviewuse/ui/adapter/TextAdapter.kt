package com.example.recyclerviewuse.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewuse.databinding.TextListItemBinding

class TextAdapter(private val data: List<String>) : RecyclerView.Adapter<TextAdapter.TextViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TextViewHolder(
            TextListItemBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        val value = data[position]
        holder.bind(value)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class TextViewHolder(private val binding: TextListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(value: String) {
           binding.textView.text = value
        }
    }
}