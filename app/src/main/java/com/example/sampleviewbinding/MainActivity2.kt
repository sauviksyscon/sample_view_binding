package com.example.sampleviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sampleviewbinding.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var activityBinding2: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBinding2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(activityBinding2.root)
        activityBinding2.textView.text="MainActivity2 Active"
    }
}