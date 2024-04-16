package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark= findViewById<Button>(R.id.btnDark)
        val buttonRead= findViewById<Button>(R.id.btnRead)
        val layout= findViewById<LinearLayout>(R.id.LinearLayout)
        val buttonGreen= findViewById<Button>(R.id.btnGreen)
        val buttonBlue= findViewById<Button>(R.id.btnBlue)
        val buttonOrange= findViewById<Button>(R.id.btnOrange)
        val buttonPink= findViewById<Button>(R.id.btnPink)


        buttonRead.setOnClickListener {
            // change to the light mode
            layout.setBackgroundResource(R.color.yellow)
        }
        buttonRead.setOnClickListener {
            Toast.makeText(applicationContext, "Hello User" , Toast.LENGTH_SHORT).show()
        }

        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }

        buttonGreen.setOnClickListener {
            layout.setBackgroundResource(R.color.Green)
        }
        buttonBlue.setOnClickListener {
            layout.setBackgroundResource(R.color.Blue)
        }
        buttonOrange.setOnClickListener {
            layout.setBackgroundResource(R.color.Orange)
        }
        buttonPink.setOnClickListener {
            layout.setBackgroundResource(R.color.Pink)
        }
    }
}