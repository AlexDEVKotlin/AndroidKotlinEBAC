package com.alexfsm.atividadeavaliativamod3

class Exercicio6 {
}

fun main() {

    var lista: MutableList<Int> = mutableListOf()
    var number = 1
    for(i in 1..99 step 1){
        number = i
        lista.add(number)
    }
    println(lista)
}

