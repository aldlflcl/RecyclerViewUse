package com.example.recyclerviewuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewuse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 바인딩 변수
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}