package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)
        editText.setText("")
    }

    fun onClickButton(view: View) {
        val nextNum = Random.nextInt(3) + 1
        val myNum = when(view.id) {
            R.id.button1 -> 1
            R.id.button2 -> 2
            else -> 3
        }

        if (nextNum == myNum) {
//            textView.text = "Поздравляю, вы угадали ($myNum)"
            textView.text = getString(R.string.winner, myNum)
            textView.setTextColor(Color.GREEN)
        } else {
            textView.text = "Вы не угадали. Было загадано: $nextNum"
            textView.setTextColor(Color.RED)
        }
    }

    fun onGoToSecondActivity(view: View) {
//        Toast.makeText(this, editText.text, Toast.LENGTH_SHORT).show()
        val intent = Intent(
            this,
            SecondActivity::class.java
        )
        intent.putExtra("myData", editText.text.toString())

        startActivity(intent)
    }
}