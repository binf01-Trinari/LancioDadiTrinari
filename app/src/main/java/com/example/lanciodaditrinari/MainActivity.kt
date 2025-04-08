package com.example.lanciodadi5binf

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lanciodaditrinari.R
import com.example.lanciodaditrinari.SecondActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var buttonLancia = findViewById<Button>(R.id.buttonLancia)
        buttonLancia.setOnClickListener(View.OnClickListener {
            var mioToast = Toast.makeText(this, "Dado lanciato!", Toast.LENGTH_LONG)
            mioToast.show()
        })
        var textViewTitle = findViewById<TextView>(R.id.textViewTitle)
        var imageViewDado = findViewById<ImageView>(R.id.imageViewDado)
    }
    private fun estraiNumero(): Int{
        return (1..6).random()
    }
    private fun lanciaIntent(mioRandom: Int){
        var mioIntent = Intent(this, SecondActivity::class.java)
        mioIntent.putExtra("NUMERO", mioRandom)
        startActivity(mioIntent)
    }
}
