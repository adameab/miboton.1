package com.adam.miboton1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //añadimos una variable nombre button y de tipo Button
        //y hemos asociado la variable al boton de la view
        val button: Button = findViewById(R.id.BotonAdam)
        button.setOnClickListener {
            //quiero que al pulsar salga un mensaje emergente que diga que has pulsado el boton
            Toast.makeText(this,"HAS PULSADO EL BOTON CON EXITO", Toast.LENGTH_LONG).show()
            Toast.makeText(this,"ERES UN BICHO", Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}
