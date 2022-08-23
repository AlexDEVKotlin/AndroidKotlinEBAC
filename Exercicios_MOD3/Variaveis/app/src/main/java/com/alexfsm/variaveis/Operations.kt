package com.alexfsm.variaveis

class Operations {
}

fun main(){
    var test = 1
    var converstion = test.toDouble()
    println(converstion)

    var a = 5
    var b = 2
    var resultado = a / b
    println(resultado)

    var resultadoConverstion = a.toDouble() / b.toDouble()
    println(resultadoConverstion)

    var texto = "16"
    var numero = 2
    var resultadoNumero = texto.toInt() * numero
    println(resultadoNumero)

    println("Hello" + " " + "World!")

    val name = "Alex"
    val template = "$name será um DEV Android Kotlin!"
    val numberLetters = "O nome $name possui ${name.length} letras"
    println(template)
    println(numberLetters)
}