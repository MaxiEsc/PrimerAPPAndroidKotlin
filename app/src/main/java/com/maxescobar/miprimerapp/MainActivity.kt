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

        //Forma en lenguaje Kotlin de extraer los datos de los EditText
        et1 = findViewById<EditText>(R.id.numeroA)
        et2 = findViewById<EditText>(R.id.numeroB)
        tv1 = findViewById<TextView>(R.id.txtv_Resultado)


    }

    //Metodo Para Sumar
    public fun sumar(a: View ){

        var valor1 : String = et1.text.toString()
        var valor2 : String = et2.text.toString()
        var suma : Float = 0F

        //Para Controlar las excepciones y no exploten
        try {
            suma = valor1.toFloat() + valor2.toFloat()
        } catch (nfe: NumberFormatException) {
        }

        var resultado : String = suma.toString()

        tv1.setText(resultado)
    }

    //Metodo Para Restar
    public fun restar(a: View ){

        var valor1 : String = et1.text.toString()
        var valor2 : String = et2.text.toString()
        var resta : Float = 0F

        //Para Controlar las excepciones y no exploten
        try {
            resta = valor1.toFloat() - valor2.toFloat()
        } catch (nfe: NumberFormatException) {
            println(nfe)
        }

        var resultado : String = resta.toString()

        tv1.setText(resultado)
    }

    //Metodo Para Multiplicar
    public fun multiplicar(a: View ){

        var valor1 : String = et1.text.toString()
        var valor2 : String = et2.text.toString()
        var multiplicacion : Float = 0F

        //Para Controlar las excepciones y no exploten
        try {
            multiplicacion = valor1.toFloat() * valor2.toFloat()
        } catch (nfe: NumberFormatException) {
            println(nfe)
        }

        var resultado : String = multiplicacion.toString()

        tv1.setText(resultado)
    }

    //Metodo Para Dividir
    public fun dividir(a: View ){

        var valor1 : String = et1.text.toString()
        var valor2 : String = et2.text.toString()
        var division : Float = 0F
        var resultado : String = ""

        //Para Controlar las excepciones y no exploten
        try {
            division = (valor1.toInt() / if (valor2.toInt() == 0 ) 1 else valor2.toInt()).toFloat()
        } catch (nfe: NumberFormatException) {
            println(nfe)
        }
        if (valor2.toInt() == 0 ){
            resultado = "Invalido ¡¡No se puede dividir por cero!!"
            }else{
            resultado = division.toString()
        }

        tv1.setText(resultado)
    }
}