package com.example.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(view: android.view.View) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show()
    }
    fun countUp(view: android.view.View) {}
    fun reset(view: android.view.View) {}
}