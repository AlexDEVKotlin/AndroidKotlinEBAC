package com.alexfsm.atividadeavaliativamod3

class Exercicio4 {
}

fun main(){
    var number = 13
    var parImpar = when {
        number % 2 == 0 -> "Número é Par"
        else -> "Número é Ímpar"
    }
    println(parImpar)
}