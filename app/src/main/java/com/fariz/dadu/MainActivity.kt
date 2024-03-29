package com.fariz.dadu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.fariz.dadu.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

//    lateinit var rollButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(R.layout.activity_main)

//            rollButton  = findViewById(R.id.roll_button)
            binding.rollButton.setOnClickListener {
                rollDice()
            }
    }

    private fun rollDice() {
   val diceImage : ImageView = findViewById(R.id.image_dice)
        val drawableRes = when(Random().nextInt(6)+1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableRes)
    }
}
