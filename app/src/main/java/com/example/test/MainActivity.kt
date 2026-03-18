package com.example.test

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.ImageView
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var text1 : TextView = findViewById<TextView>(R.id.text1)
        var text2 : TextView = findViewById<TextView>(R.id.text2)
        var text3 : TextView = findViewById<TextView>(R.id.text3)
        var text4 : TextView = findViewById<TextView>(R.id.text4)
        var text5 : TextView = findViewById<TextView>(R.id.text5)
        var good : ImageView = findViewById<ImageView>(R.id.good)
        var happy : ImageView = findViewById<ImageView>(R.id.happy)
        var soso : ImageView = findViewById<ImageView>(R.id.soso)
        var bad : ImageView = findViewById<ImageView>(R.id.bad)
        var angry : ImageView = findViewById<ImageView>(R.id.angry)

        fun resetTextColors() {
            text1.setTextColor(Color.BLACK)
            text2.setTextColor(Color.BLACK)
            text3.setTextColor(Color.BLACK)
            text4.setTextColor(Color.BLACK)
            text5.setTextColor(Color.BLACK)
        }

        good.setOnClickListener {
            resetTextColors()
            text1.setTextColor(Color.parseColor("#F9DC77"))
        }

        happy.setOnClickListener {
            resetTextColors()
            text2.setTextColor(Color.parseColor("#AEE9FE"))
        }

        soso.setOnClickListener {
            resetTextColors()
            text3.setTextColor(Color.parseColor("#94A5FE"))
        }

        bad.setOnClickListener {
            resetTextColors()
            text4.setTextColor(Color.parseColor("#77C48D"))
        }

        angry.setOnClickListener {
            resetTextColors()
            text5.setTextColor(Color.parseColor("#D94F49"))
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}