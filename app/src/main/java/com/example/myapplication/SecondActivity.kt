package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        val data = intent.extras?.getString("myData") // с default
        val data = intent.getStringExtra("myData")
        findViewById<TextView>(R.id.textView2).text = data
    }
}