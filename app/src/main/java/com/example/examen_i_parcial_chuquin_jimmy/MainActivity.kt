package com.example.examen_i_parcial_chuquin_jimmy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_suma = findViewById<Button>(R.id.btn_suma)

        btn_suma.setOnClickListener {
            val menu = Intent(this, menu::class.java)
            startActivity(menu)
    }
}
}