package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    val listOfthings = arrayListOf("watch movies", "Eat Food", "Take a walk", "Relax and chill")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomThing = random.nextInt(listOfthings.count())
            selectedFoodTxt.text = listOfthings[randomThing]
        }
        addFoodBtn.setOnClickListener{
            val newFood = addFoodTxt.text.toString()
            listOfthings.add(newFood)
            addFoodTxt.text.clear()
            println(listOfthings)
        }
        clrBtn.setOnClickListener{
            println("i am working")
        }

    }
}
