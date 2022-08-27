package com.alexfsm.atividadeavaliativamod4

class Exercicio3 {
}

fun main(){
    calculadora(16,13,::somaCalculadora)
    calculadora(16,13,::multiplicacaoCalculadora)
}

fun calculadora(num1: Int, num2: Int, operation: (Int,Int) -> Int){
    println(operation(num1, num2))
}

fun somaCalculadora(num1: Int, num2: Int): Int{
    return num1 + num2
}

fun multiplicacaoCalculadora(num1: Int, num2: Int) = num1 * num2
