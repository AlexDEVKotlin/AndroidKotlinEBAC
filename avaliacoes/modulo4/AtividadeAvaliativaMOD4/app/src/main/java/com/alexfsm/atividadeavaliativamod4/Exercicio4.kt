package com.alexfsm.atividadeavaliativamod4

class Exercicio4 {
}

fun main(){
    var lista: MutableList<Int> = mutableListOf()
    var number: Int = 0
    for(i in 1..99 step 1){
        number = i
        lista.add(number)
    }
    val filtered = lista.filter{it % 2 == 0}
    println(filtered)
}