package com.example.lanciodaditrinari

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var textViewTitle = findViewById<TextView>(R.id.textViewTitle)
        var imageViewDado = findViewById<ImageView>(R.id.imageViewDado)

        val buttonLancia = findViewById<Button>(R.id.buttonLancia)
        buttonLancia.setOnClickListener(View.OnClickListener {
            val mioToast = Toast.makeText(this, "Dado lanciato!", Toast.LENGTH_LONG)
            mioToast.show()
            secondoIntent()
        })
    }

    private fun secondoIntent(){
        val mioIntent = Intent(this, SecondoActivity::class.java)
        startActivity(mioIntent)
    }
}
