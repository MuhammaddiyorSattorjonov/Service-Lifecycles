package com.example.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.service.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            btnStart.setOnClickListener {
                val intent = Intent(this@MainActivity,MyService::class.java)
                startService(intent)
            }
            btnStop.setOnClickListener {
            val intent = Intent(this@MainActivity,MyService::class.java)
                stopService(intent)
            }
        }
    }
}