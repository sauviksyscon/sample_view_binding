package com.example.sampleviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sampleviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.RIdTextView.text="Binding Active"
    }
}