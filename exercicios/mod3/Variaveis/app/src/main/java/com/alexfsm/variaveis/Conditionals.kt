package com.alexfsm.variaveis

class Conditionals {
}

fun main(){
    var numero1 = 13
    var numero2 = 16
    var numero3 = 2

    if (numero1 > numero2 && numero1 > numero3){
        println("Maior Número")
    } else if(numero1 > numero2){
        println("Maior que Número 2 e Menor que Número 3")
    } else if(numero1 > numero3){
        println("Maior que Número 3 e Menor que Número 2")
    } else{
        println("Menor Número")
    }

    when{
        numero1 > numero2 && numero1 > numero3 -> println("Maior Número")
        numero1 > numero2 -> println("Maior que Número 2 e Menor que Número 3")
        numero1 > numero3 -> println("Maior que Número 3 e Menor que Número 2")
        else -> println("Menor Número")
    }

    val resultado = when {
        numero1 > numero2 && numero1 > numero3 -> println("Maior Número")
        numero1 > numero2 -> println("Maior que Número 2 e Menor que Número 3")
        numero1 > numero3 -> println("Maior que Número 3 e Menor que Número 2")
        else -> println("Menor Número")
    }
    println(resultado)
}