package com.fariz.dadu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val kaku tidak bisa diubah nilainya
            val rollButton : Button = findViewById(R.id.roll_button)
            rollButton.setOnClickListener {
                Toast.makeText(this,"Role Dice !!!",Toast.LENGTH_SHORT).show()
            }
    }
}
