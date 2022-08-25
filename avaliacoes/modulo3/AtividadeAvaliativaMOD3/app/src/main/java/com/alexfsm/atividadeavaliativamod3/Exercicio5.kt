package com.alexfsm.atividadeavaliativamod3

class Exercicio5 {
}

fun main(){
    var array: IntArray = IntArray(40)
    for(i in array.indices){
        array[i] = i + 1
    }
    for(i in 0..array.size -2){
        var resultado = array[i]
        println(resultado)
    }

}