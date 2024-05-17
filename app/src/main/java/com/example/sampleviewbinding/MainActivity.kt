package com.example.sampleviewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.example.sampleviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.textView.text="Binding Active"
        mainBinding.btnSave.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        })
    }
}


