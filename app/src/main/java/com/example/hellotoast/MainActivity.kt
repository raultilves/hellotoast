package com.example.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var mCount: Int = 0
    lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
    }

    fun showToast(view: android.view.View) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show()
    }
    fun countUp(view: android.view.View) {
        mCount++
        mShowCount.text = mCount.toString()
    }
    fun reset(view: android.view.View) {
        mCount = 0
        mShowCount.text = mCount.toString()
    }
}