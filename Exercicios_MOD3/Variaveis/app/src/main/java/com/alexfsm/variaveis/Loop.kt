package com.alexfsm.variaveis

class Loop {
}

fun main(){
    var array: IntArray = IntArray(20)
    for(i in array.indices){
        println(array[i])
    }
    var o = 0
    while(o <= array.size -1){
        println(array[o])
        o++
    }

    for(j in array.indices){
        array[j] = j * 7
    }

    var resultado = 0.0
    for(j in 0..array.size -1){
        resultado = array[j] / 3.2
        println(resultado)
    }
    println("Valor do Último Resultado: $resultado")

    for(j in 0..array.size -1){
        resultado = resultado + array[j] / 3.2
    }
    println("Valor da Soma dos Valores: $resultado")

    var l = 0
    while(l < array.size){
        resultado += array[l] / 3.2
        l++
    }
    println(resultado)
}