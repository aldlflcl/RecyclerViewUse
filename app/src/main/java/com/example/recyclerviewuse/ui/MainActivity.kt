package com.example.recyclerviewuse.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.example.recyclerviewuse.databinding.ActivityMainBinding
import com.example.recyclerviewuse.ui.adapter.TextAdapter
import com.example.recyclerviewuse.util.SampleData

class MainActivity : AppCompatActivity() {

    // 바인딩 변수
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        binding.textRecyclerView.apply {
            adapter = TextAdapter(SampleData.data)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }


}