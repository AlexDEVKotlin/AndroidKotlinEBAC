package com.alexfsm.variaveis

class NullSafety {
}

fun main() {
    // var inteiro: Int? = null
    var inteiro2 = 5
    // var resultado = (inteiro ?: 0) + inteiro2

    val inteiro: Int? = null
    var resultado = 0

    if(inteiro != null){
        resultado = inteiro + inteiro2
    }

    var texto: String? = "teste"
    var tamanho: Int? = texto?.length
    // var tamanho: Int = texto?.length ?: 0
 }