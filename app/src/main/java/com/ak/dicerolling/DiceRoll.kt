package com.ak.dicerolling

import android.util.Range

class DiceRoll(val kenar:Int) {

    fun roll():Int{
       return (1..kenar).random()
   }
}