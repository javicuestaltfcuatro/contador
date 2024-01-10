package com.example.contador

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.contador.R

class MainActivity : AppCompatActivity() {

    private lateinit var textView3: TextView
    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var imageButton2: ImageButton
    private var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView3 = findViewById(R.id.textView3)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        imageButton2 = findViewById(R.id.imageButton2)

        button.setOnClickListener {
            decrementarContador()
        }

        button2.setOnClickListener {
            incrementarContador()
        }

        imageButton2.setOnClickListener {
            reiniciarContador()
        }
    }

    private fun decrementarContador() {
        if (contador > 0) {
            contador--
            textView3.text = contador.toString()
        }
    }

    private fun incrementarContador() {
        contador++
        textView3.text = contador.toString()
    }

    private fun reiniciarContador() {
        contador = 0
        textView3.text = contador.toString()
    }
}