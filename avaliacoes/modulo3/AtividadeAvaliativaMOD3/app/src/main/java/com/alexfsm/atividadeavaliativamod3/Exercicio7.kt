package com.alexfsm.atividadeavaliativamod3

class Exercicio7 {
}

fun main(){
    var lista: MutableList<Int> = mutableListOf()
    var number = 1
    for(i in 1..99 step 1){
        number = i
        lista.add(number)
    }

    var soma = 0
    var i = 0
    while(i <= lista.size){
        soma = soma + i
        i++
    }
    println(soma)
}