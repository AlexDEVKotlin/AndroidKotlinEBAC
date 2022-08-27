package com.alexfsm.atividadeavaliativamod4

class Exercicio5 {
}

fun main(){
    val listName: List<String> = listOf("Alex", "Mickaela", "Fernando", "Fernanda")
    listName.map{
        "Olá $it!"
    }.forEach{
        println(it)
    }
}