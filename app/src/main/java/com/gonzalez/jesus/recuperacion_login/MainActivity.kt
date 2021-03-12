package com.gonzalez.jesus.recuperacion_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //primero señalar el edittext a un text view
        var etx_nombre: TextView = findViewById(R.id.edtx_nombre)
        var etx_apellido: TextView = findViewById(R.id.edtx_apellido)


        btn_registrar.setOnClickListener(){
            //sacar texto escrito del edittext desde el textview
            var nombre: String = etx_nombre.text.toString()
            var apellido: String = etx_apellido.text.toString()

           // Toast.makeText(this,"$nombre $apellido", Toast.LENGTH_LONG).show() //se muestra como mensaje temporal

            var intent: Intent= Intent(this,Bienvenida::class.java)
            intent.putExtra("nombre",nombre)
            intent.putExtra("apellido", apellido)
            startActivity(intent)
        }

    }
}