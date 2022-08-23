package com.alexfsm.variaveis

class Collections {
}

fun main() {
    var array: Array<String> = Array(10) { "" }
    var array2: DoubleArray = DoubleArray(2) { i -> 1.0 * i }
    array2[0] = 5.0
    array2.set(1, 15.0)
    println(array2[0])
    println(array2.get(1))

    var mutableList: MutableList<Int> = mutableListOf()
    var lista: List<String> = listOf("valor1", "valor2")

    mutableList.add(5)
    mutableList.add(8)
    println("Quantidade Itens da Lista: " + mutableList.size)
    mutableList.remove(0)
    mutableList[0] = 1
    mutableList.set(1, 7)
    println("Item index 0 da Lista mutableList: " + mutableList[0])
    println("Item index 0 da Lista: " + lista.get(0))

    var mutableMap: MutableMap<String,String> = mutableMapOf()
    var map: Map<Int, Int> = mapOf(Pair(202210115, 1))

    println(mutableMap.contains("Alex"))
    mutableMap["Alex"] = "Dev Kotlin"
    println(mutableMap.contains("Alex"))
    mutableMap.put("Alex", "DEV Android Kotlin")
    println(mutableMap.get("Alex"))
    println(mutableMap["Fernando"])
}
