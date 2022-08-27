package com.alexfsm.funcoes

class FuncoesOrdemSuperior {
}

fun main(){
    firstHighOrderFunction("Hello ", "World!", ::concatString)
    firstHighOrderFunction("Another", "Text", ::printStringNumbersOfLetters)
    println("")
    val concat: (String, String) -> Unit = {val1, val2 -> println(val1 + val2)}
    val numberOfLetters = {val1: String, val2: String -> println("$val1 has ${val1.length} letters, and $val2 has ${val2.length} letters")}
    firstHighOrderFunction("Hello ", "World!", concat)
    firstHighOrderFunction("Developer", "Kotlin", numberOfLetters)
    println("")
    val div: (Int) -> Int = {it / 2}
    println(div(16))
    println("")
    firstHighOrderFunction("Hello ", "World!", {val1: String, val2: String -> println(val1 + val2)})
    firstHighOrderFunction("Alex", "Fernando", {
        val1: String, val2: String ->
        println(val1)
        println(val2)
        println("Texte")
    })
    println("")
    val operation = {
        number1: Int, number2: Int ->
        var result = number1 * 2
        result = result / number2
        result = result + (number1 * number2)
        result
    }
    println(operation(16, 8))
}


fun firstHighOrderFunction(text1: String, text2: String, operation: (String, String) -> Unit) {
    operation(text1 , text2)
}

fun concatString(val1: String, val2: String) = println(val1 + val2)

fun printStringNumbersOfLetters(val1: String, val2: String) = println("$val1 has ${val1.length} letters, and $val2 has ${val2.length} letters")
