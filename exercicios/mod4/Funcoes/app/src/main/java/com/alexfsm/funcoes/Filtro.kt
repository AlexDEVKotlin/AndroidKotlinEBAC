package com.alexfsm.funcoes

class Filtro {
}

fun main(){
    println("***** Exemplos com Filter *****")
    println("")

    val listNumber = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val filtered = listNumber.filter{it % 2 == 0}
    val filteredNot = listNumber.filterNot{it % 2 == 0}
    val biggerThan5 = listNumber.filter{it > 5}

    println("Números divisíveis por 2: $filtered")
    println("Números não divisíveis por 2: $filteredNot")
    println("Números maiores que 5: $biggerThan5")

    println("")
    println("***** Exemplos com Map *****")
    println("")

    val div = listNumber.map{it / 2}
    println(div)
    val citiesList = listOf("Gramado", "Lisboa", "New York")
    val modifiedCities = citiesList.map{"Quero viajar para $it!"}
    println(modifiedCities)

    println("")
    println("***** Exemplos com Zip *****")
    println("")

    val countryList = listOf("Brasil", "Portugal", "Estados Unidos")
    val cityCountry = citiesList.zip(countryList) {city, country -> "$city, city of $country!"}
    println(cityCountry)

    println("")
    println("***** Exemplos com Associate *****")
    println("")

    val mapCities = citiesList.associateWith{it.length}
    val mapLength = citiesList.associateBy{it.length}
    println("Exemplo associateWith: $mapCities")
    println("Exemplo associateBt: $mapLength")

    println("")
    println("***** Exemplos com ForEach *****")
    println("")

    citiesList.forEach{
        println(it)
    }

    citiesList.map{
        "Olá $it!"
    }.forEach{
        println(it)
    }

    citiesList.filter {
        it.length > 6
    }.map {
        "Hello $it!"
    }.forEach{
        println(it)
    }
}