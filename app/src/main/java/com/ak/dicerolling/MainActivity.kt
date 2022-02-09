package com.ak.dicerolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val button1 = findViewById<Button>(R.id.diceRoll)
     val image = findViewById<ImageView>(R.id.imageView2)
       button1.setOnClickListener {
           val dice = DiceRoll(6)
           val sonuc =dice.roll()
           val drawableResourse = when(sonuc){
               1 -> R.drawable.dice_1
               2 -> R.drawable.dice_2
               3 -> R.drawable.dice_3
               4 -> R.drawable.dice_4
               5 -> R.drawable.dice_5
               else -> R.drawable.dice_6

           }
           image.setImageResource(drawableResourse)
           image.contentDescription = sonuc.toString()
       }

    }
}