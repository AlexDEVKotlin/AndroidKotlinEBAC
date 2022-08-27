package com.alexfsm.funcoes

class FuncoesSimples {
}

fun main(){
    val myName: String = "Alex"
    val myLastName: String = "Fernando"
    val myAge: Int = 22
    myFirstFunction(myName, myLastName,myAge)
    myFirstFunction("Mickaela", "Rodriguês", 20)
    myFirstFunction(nome = "Fulano", idade = 50)
    val resultado = resto(19,4)
    println(resultado)
}

fun resto(val1: Int, val2: Int) = val1 % val2

fun myFirstFunction(nome: String, sobrenome: String = "De Tal", idade: Int) {
    println("Ola $nome $sobrenome, tudo bem?")
    when {
        idade <= 5 -> println("Vocé é um(a) bebê!")
        idade <= 12 -> println("Vocé é uma criança!")
        idade <= 17 -> println("Vocé um(a) adolescente!")
        idade >= 18 -> println("Vocé é um(a) adulto(a)!")
        idade >= 60 -> println("Você é um(a) idoso(a)!")
    }
    if(idade > 30){
        println("Você já passou dos 30!")
        return
    }
    println("Hello World!")
}