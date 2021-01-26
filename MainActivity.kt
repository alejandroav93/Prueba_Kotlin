package com.example.ejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes()
    }

    //Esta es una prueba de comentario
    /*
    Esta es una prueba de comentario 2
     */

    //Variables y Constantes
    private fun variablesYConstantes(){
        //Variables
        var myFirstVariable = "Esta es una prueba"
        var myFirstNumbrer = 10000
        var mySecondVariable = "Segunda parte de la prueba"
        println(myFirstVariable)
        println(myFirstNumbrer)
        println(mySecondVariable)

        //Constantes
            val myFirstConstante = "Seguimos con la prueba"
            println(myFirstConstante)

        //Tipos de datos
            val myString3 = myFirstVariable + " " + mySecondVariable
            println(myString3)

        //Enteros  = Byte -127 +128 short -32768 +32767 Int Long
            val myInt = 100
            val myInt2 = 200
            val myInt3 = myInt + myInt2
            println(myInt3)

        //Decimales Float 32bit Double 64bit
            val myFloat = 100.5
            val myFloat2 = 199.5
            val myInt10 = 10
            val myFloat3 = myFloat + myFloat2 + myInt10
            println(myFloat3)

        //Boolean
        val myBool = true
        val myBool1 = false
        println(myBool)
    }
    private fun sentenciaIf(){
        val myNumber = 7
        if(myNumber <= 10 && myNumber >5){
            println("$myNumber es  menor o igual que 10")
        }
        else{
            println("$myNumber es mayor que 10")
        }

    }
    private fun sentenciaWhen(){
        val country = "USA"
        when (country){
            "Guatemala" -> {
                println("El idioma es español")
            }
            "Nicaragua" -> {
                println("El idioma es español")
            }
            "USA" -> {
                println("El idioma es Ingles")
            }
            else -> {
                println("No conocemos el idioma")
            }
        }
    }
}