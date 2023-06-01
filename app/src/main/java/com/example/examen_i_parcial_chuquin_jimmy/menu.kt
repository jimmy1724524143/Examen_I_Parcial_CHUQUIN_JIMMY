package com.example.examen_i_parcial_chuquin_jimmy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


class menu : AppCompatActivity() {
    lateinit var n1 : EditText
    lateinit var n2 : EditText
    lateinit var btn_calcular : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        n1=findViewById(R.id.n1)
        n2=findViewById(R.id.n2)
        btn_calcular=findViewById(R.id.btn_calcular)



        val btn_calcular = findViewById<Button>(R.id.btn_calcular)

        btn_calcular.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(n1.text.toString())
            val num2 = Integer.parseInt(n2.text.toString())
            val sum = num1 + num2


            val intent = Intent(this, resultado::class.java)
            intent.putExtra("Result", sum)
            startActivity(intent)


        })
        }
}

