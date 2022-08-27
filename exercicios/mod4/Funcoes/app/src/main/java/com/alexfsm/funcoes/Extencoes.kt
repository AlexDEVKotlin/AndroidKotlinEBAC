package com.alexfsm.funcoes

class Extencoes {
}

fun main() {
    val number: Int = 16
    println("Número é Ímpar? ${number.isEven()}")

    println("")

    val baseText = "Alex"
    baseText.myConcat(" Fernando")

    println("")

    val result = 16.0 mySum 13.0
    println(result)

    println("")
    
    val number3: Double = 7.0
    number3.operations(4.5)
}

fun Int.isEven(): Boolean {
    return this % 2 != 0
}

fun String.myConcat(text: String){
    println(this + text)
}

infix fun Double.mySum(number2: Double): Double{
    return this + (number2 * 2)
}

fun Double.operations(number2: Double){
    val sum = this + number2
    val subtraction = this - number2
    val multiplication = this * number2
    val division = this / number2
    val sumResults = sum + subtraction + multiplication + division
    println("Operação de Soma: $sum")
    println("Operação de Subtração: $subtraction")
    println("Operação de Multiplicação: $multiplication")
    println("Operação de Divisão: $division")
    println("Soma dos Resultados: $sumResults")
}
