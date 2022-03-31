 package com.example.hap_mb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ro : Button = findViewById(R.id.roll)
        val di1 : ImageView = findViewById(R.id.img_d1)
        val di2 : ImageView = findViewById(R.id.img_d2)
        ro.setOnClickListener() {
            val rand = Random().nextInt(6)+1
            val reso1 = when(rand){
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                6 -> R.drawable.dice6
                else -> R.drawable.dice6

            }
            di1.setImageResource(reso1)
            val rand1 = Random().nextInt(6)+1
            val reso2 = when(rand1){
                1 -> {R.drawable.dice1

                }
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                6 -> R.drawable.dice6
                else -> R.drawable.dice6

            }
            di2.setImageResource(reso2)
        }
    }
}