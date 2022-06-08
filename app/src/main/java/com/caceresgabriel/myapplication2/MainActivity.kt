package com.caceresgabriel.myapplication2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.regex.Pattern


class MainActivity : AppCompatActivity() {

    private lateinit var buttonSaludo: Button
    private lateinit var textViewSaludo: TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Toast.makeText(this, "Hola Mundo", Toast.LENGTH_SHORT).show()
        inicializador()
        listeners()

        Toast.makeText(this,"gabriel.caceres@epn.com".email().toString(),Toast.LENGTH_SHORT).show()

    }

    fun inicializador() {
        buttonSaludo = findViewById(R.id.buttonSaludo)
        textViewSaludo = findViewById(R.id.textViewSaludo)

    }

    fun listeners() {
        buttonSaludo.setOnClickListener { miVista: View ->
            Toast.makeText(this, "Me presionaste", Toast.LENGTH_LONG).show()
        }

        textViewSaludo.setOnClickListener {
            Toast.makeText(this, "Presionaste la caja", Toast.LENGTH_LONG).show()
        }

    }

    fun String.email(): Boolean {
        val EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )
        return EMAIL_ADDRESS_PATTERN.matcher(this).matches()
    }
}