package com.maxescobar.miprimerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var et1 :EditText
    private lateinit var et2: EditText
    private lateinit var tv1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById<EditText>(R.id.numeroA)
        et2 = findViewById<EditText>(R.id.numeroB)
        tv1 = findViewById<EditText>(R.id.txtv_Resultado)

        //Este metodo Suma
    }

    public fun sumar(a: View ){
        Toast.makeText(this,"Hola hasta aqui todo bien",Toast.LENGTH_SHORT)

        var valor1 : String = et1.text.toString()
        var valor2 : String = et2.text.toString()
        var suma : Int = 0
        try {
            suma = valor1.toInt() + valor2.toInt()
        } catch (nfe: NumberFormatException) {
        }

        var resultado : String = suma.toString()

        tv1.setText(resultado)
    }

    public fun restar(a: View ){
        Toast.makeText(this,"Hola hasta aqui todo bien",Toast.LENGTH_SHORT)

        var valor1 : String = et1.text.toString()
        var valor2 : String = et2.text.toString()
        var suma : Int = 0
        try {
            suma = valor1.toInt() - valor2.toInt()
        } catch (nfe: NumberFormatException) {
        }

        var resultado : String = suma.toString()

        tv1.setText(resultado)
    }

    public fun multiplicar(a: View ){
        Toast.makeText(this,"Hola hasta aqui todo bien",Toast.LENGTH_SHORT)

        var valor1 : String = et1.text.toString()
        var valor2 : String = et2.text.toString()
        var suma : Int = 0
        try {
            suma = valor1.toInt() * valor2.toInt()
        } catch (nfe: NumberFormatException) {
        }

        var resultado : String = suma.toString()

        tv1.setText(resultado)
    }

    public fun dividir(a: View ){
        Toast.makeText(this,"Hola hasta aqui todo bien",Toast.LENGTH_SHORT)

        var valor1 : String = et1.text.toString()
        var valor2 : String = et2.text.toString()
        var suma : Int = 0
        var resultado : String = ""
        try {
            suma = valor1.toInt() / if (valor2.toInt() == 0 ) 1 else valor2.toInt()
        } catch (nfe: NumberFormatException) {

        }
        if (valor2.toInt() == 0 ){
            resultado = "Invalido"
            }else{
            resultado = suma.toString()
        }


        tv1.setText(resultado)
    }
}