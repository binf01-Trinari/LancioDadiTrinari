package com.example.lanciodaditrinari

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TerzoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_terzo)

        val mioRandom = intent.getIntExtra("NUMERO", -1)
        val dadoRandom = findViewById<ImageView>(R.id.dadoRandom)

        val arrayDadi = when(mioRandom){
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            else -> {R.drawable.dice_face_6}
        }

        dadoRandom.setImageResource(arrayDadi as Int)
    }
}