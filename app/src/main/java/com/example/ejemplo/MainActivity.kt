/*
* Universidad del Valle de Guatemala
* Alejandro ALvarez
* Carné 12429
* Guatemala 28 Enero de 2021
 */
package com.example.ejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes()
        arrays()
        sentenciaIf()
        sentenciaWhen()
        maps()
        loops()
        funciones()
        nullSafety()
    }

    //Esta es una prueba de comentario
    /*
    Esta es una prueba de comentario 2
     */
    fun funciones(){
        sayHello()
        println(sumTwoNumber(10, 20))
        println(sumTwoNumber(1000, 22000))
        sayMyNameAndDeuda("Alejandro", 200.00)
    }
    fun sayMyNameAndDeuda(name: String, deuda: Double){
        println("Hola, Mi Nombre es $name y mi deuda es $deuda")
    }
    fun nullSafety(){
        var myString = "UVG"
        println(myString)
        //Gestion de nulos
        //Esta e suna variable null safety
        var mySafetyString: String?
        mySafetyString = null
        println(mySafetyString?.length)
        mySafetyString?.let {
            println()
        }?: run {
            println(mySafetyString)
        }
    }
    fun sayHello(){
        println("Hello World!")
    }
    fun sumTwoNumber(fNumber: Int, sNumber: Int): Int{
        val sum: Int = fNumber + sNumber
        return sum
    }
    //Variables y Constantes
    private fun variablesYConstantes() {
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

    fun arrays() {
        val name = "Alejandro"
        val apellido = "Alvarez"
        val universidad = "Del Valle de Guatemala"
        val ciudad = "Guatemala"

        //crear array
        val myArray: ArrayList<String> = arrayListOf<String>()

        //agregar datos
        myArray.add(name)
        myArray.add(apellido)
        myArray.add(universidad)
        myArray.add(ciudad)

        println(myArray)

        //agregar un conjunto de datos
        myArray.addAll(listOf("Prueba UVG", "Uso Array Kotlin"))
        println(myArray)

        //acceso a datos
        val myCompany: String = myArray[2]
        println(myArray)

        //modificar datos
        myArray[2] = "Solo del Valle"
        println(myArray)

        //eliminar Datos
        myArray.removeAt(2)
        println(myArray)

        //recorrer el array
        myArray.forEach {
            String
            println(it)
        }
    }
        private fun sentenciaIf() {
            val myNumber = 7
            if (myNumber in 6..10) {
                println("$myNumber es  menor o igual que 10")
            } else {
                println("$myNumber es mayor que 10")
            }

        }

        private fun sentenciaWhen() {
            val country = "USA"
            when (country) {
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
            //when con in

            val codigo = 10

            when (codigo) {
                1, 2, 3, 4, 5 -> {
                    println("Debe usar camisa azul")
                }
                in 6..15 -> {
                    println("Debe usar camisa roja")
                }
            }
        }

        fun maps() {
        var myMap : Map<String, Int> = mapOf()
            println(myMap)

            //Agregar datos
            myMap = mutableMapOf("Uno" to 1, "Dos" to 2, "Tres" to 3, "Cuatro" to 4)
            println(myMap)

            //Agregar un dato
            myMap["Cinco"] = 5
            myMap["Seis"] = 6
            println(myMap)

            //Agregar con put
            myMap.put("Siete", 7)
            println(myMap)

            //Accesar a los datos
            println(myMap["Seis"])

            //Eliminar Datos
            myMap.remove("Seis")
            println(myMap)
        }
        fun loops(){
            //for while
            //for

            val myArray: List<String> = listOf("Alejandro", "Alvarez", "Del Valle de Guatemala", "Guatemala")
            val myMap = mutableMapOf("Uno" to 1, "Dos" to 2, "Tres" to 3, "Cuatro" to 4)

            for(myString: String in myArray){
                println(myString)
            }
            for(myElement: MutableMap.MutableEntry<String, Int> in myMap){
                println("${myElement.key}-${myElement.value}")
            }
            //Aplicación
            println("Ejemplo con in")
            for(x:Int in 0..10){
                println(x)
            }
            println("Ejemplo con until")
            for(x:Int in 0 until 10){
                println(x)
            }
            println("Ejemplo con until-step")
            for(x:Int in 0 until 10 step 2){
                println(x)
            }
            println("Ejemplo con downTo-step")
            for(x:Int in 10 downTo 0 step 3){
                println(x)
            }
            println("Ejemplo con IntRange")
            val myNumericArray: IntRange = (0..20)
            for (myNum:Int in myNumericArray){
                println(myNum)
            }
            //While
            println("Ejemplo con While")
            var x =0
            while(x<10){
                println(x)
                x=(x+1)
            }
        }
}
