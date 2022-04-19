package com.optiapp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

//val diceOne= Dice()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val broll: Button = findViewById(R.id.buttonRoll)
        val diceImage1: ImageButton = findViewById(R.id.imageButton2)
        val diceImage2: ImageButton = findViewById(R.id.imageButton4)
        val diceImage3: ImageButton = findViewById(R.id.imageButton5)

//        {
//        val roll: Button = findViewById(R.id.button)
//        val randomText: TextView = findViewById(R.id.random)
//        val randomPhrases=
//            arrayOf("hardworking","lazy","somewhat lazy", "very lazy", "very lazy", "dedicated") First Assignment
//        roll.setOnClickListener {
//            val varies= Random.nextInt(randomPhrases.size)
//            randomText.text=randomPhrases.get(varies)
//
//        }}

//        val roll: Button = findViewById(R.id.button)
//        val toast= Toast.makeText(this,"content", Toast.LENGTH_SHORT)
//        toast.show()
//        CREATING RANDOM NUMBERS
//        /////////////
//        val diceRange=1..6
//        val randomNumber= diceRange.random()
//        Log.v("print", randomNumber.toString());
        /////////////////////

//        when(answer){ this is used to compare answer to luck or anything in the {}, when they are equal it carries out the command
//            luck-> println("you win")
//        }

//        Log.v("print", diceOne.sides.toString());
//        diceOne.roll()
     fun rollDice() {
         val diceOne = Dice(6)
         val diceTwo = Dice(6)
         val diceThree = Dice(6)
         val diceOneRoll = diceOne.rollDice()
         val diceTwoRoll = diceTwo.rollDice()
         val diceThreeRoll = diceThree.rollDice()
         when (diceOneRoll) {
             1 ->diceImage1.setImageResource(R.drawable.dice_1)
                 2->diceImage1.setImageResource(R.drawable.dice_2)
             3->diceImage1.setImageResource(R.drawable.dice_3)
             4->diceImage1.setImageResource(R.drawable.dice_4)
             5->diceImage1.setImageResource(R.drawable.dice_5)
             6->diceImage1.setImageResource(R.drawable.dice_6)
         }
         when (diceTwoRoll) {
             1 ->diceImage2.setImageResource(R.drawable.dice_1)
                 2->diceImage2.setImageResource(R.drawable.dice_2)
             3->diceImage2.setImageResource(R.drawable.dice_3)
             4->diceImage2.setImageResource(R.drawable.dice_4)
             5->diceImage2.setImageResource(R.drawable.dice_5)
             6->diceImage2.setImageResource(R.drawable.dice_6)
         }
         when (diceThreeRoll) {
             1 -> diceImage3.setImageResource(R.drawable.dice_1)
             2 ->diceImage3.setImageResource(R.drawable.dice_2)
                 3->diceImage3.setImageResource(R.drawable.dice_3)
             4->diceImage3.setImageResource(R.drawable.dice_4)
             5->diceImage3.setImageResource(R.drawable.dice_5)
             6->diceImage3.setImageResource(R.drawable.dice_6)
         }
             if(diceOneRoll==6 && diceTwoRoll==6){
                 val toast= Toast.makeText(this,"You Win", Toast.LENGTH_LONG)
        toast.show()
         }
    if(diceOneRoll==6 && diceThreeRoll==6){
        val toast1= Toast.makeText(this,"You Win", Toast.LENGTH_LONG)
        toast1.show()
    }
    if(diceThreeRoll==6 && diceTwoRoll==6){
        val toast2= Toast.makeText(this,"You Win", Toast.LENGTH_LONG)
        toast2.show()
    }
    if(diceThreeRoll+diceTwoRoll==9){
        val toast3= Toast.makeText(this,"You lose", Toast.LENGTH_LONG)
        toast3.show()
    }
    if(diceOneRoll+diceThreeRoll==9){
        val toast4= Toast.makeText(this,"You lose", Toast.LENGTH_LONG)
        toast4.show()
    }
    if(diceOneRoll+diceTwoRoll==9){
        val toast5= Toast.makeText(this,"You lose", Toast.LENGTH_LONG)
        toast5.show()
    }

     }
        broll.setOnClickListener {
            rollDice()

        }

    }



    class Dice(var sides: Int) {
        fun rollDice(): Int {
            return (1..sides).random()
        }
    }
}

//class Dice {
//    private val sides=6
//    fun roll(){
//        val diceRange=1..sides
//        val randomNumber= diceRange.random()
//        Log.v("print", randomNumber.toString())
//    }
//
//}
