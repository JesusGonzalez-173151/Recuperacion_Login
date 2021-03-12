package com.gonzalez.jesus.recuperacion_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        var tv_nombrefull = findViewById(R.id.tv) as TextView

        val bundle = intent.extras

        if (bundle != null) {
            var nombre = bundle.getString("nombre")
            var apellido = bundle.getString("apellido")

            tv_nombrefull.setText("$nombre $apellido")
        }
    }
}