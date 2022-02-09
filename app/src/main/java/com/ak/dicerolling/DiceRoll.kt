package com.ak.dicerolling


class DiceRoll(val kenar:Int) {

    fun roll():Int{
       return (1..kenar).random()
   }
}
