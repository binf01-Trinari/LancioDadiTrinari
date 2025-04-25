package com.example.lanciodaditrinari

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_secondo)

        val numeroInput = findViewById<EditText>(R.id.numeroInput) //recuper il numero inserito dall'utente

        val risultato = findViewById<Button>(R.id.risultato) // recupero il bottone
        risultato.setOnClickListener{
            val numeroInputStringa = numeroInput.text.toString() //converto l'input in una stringa per poi convertirla in intero
            val numeroScelto = numeroInputStringa.toIntOrNull()

            val mioRandom = estraiNumero()
            if (numeroScelto != null && numeroScelto <=6 && numeroScelto > 0) {
                terzoIntent(mioRandom, numeroScelto)
            }
        }
    }

    private fun estraiNumero(): Int{
        return (1..6).random()
    }

    private fun terzoIntent(mioRandom: Int, numeroScelto: Int){
        val mioIntent = Intent(this, TerzoActivity::class.java)
        mioIntent.putExtra("NUMERO", mioRandom)
        mioIntent.putExtra("NUMEROINPUT", numeroScelto)
        startActivity(mioIntent)
    }
}