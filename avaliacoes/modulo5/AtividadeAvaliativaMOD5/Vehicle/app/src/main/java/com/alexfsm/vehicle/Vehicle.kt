package com.alexfsm.vehicle

class Vehicle (
    private var velocity: Long = 0,
    private var acceleration: Long = 10,
    private var model: String = "",
    private var horsePower: Long = 0,
    private var price: Double = 0.0) {

    fun speed(velocity: Long, acceleration: Long){
        this.velocity = velocity
        this.acceleration = acceleration
        this.velocity = velocity + acceleration
    }

    fun slowdown(acceleration: Long){
        this.acceleration = acceleration
        this.velocity = this.velocity - acceleration
        if(this.velocity < 0){
            this.velocity = 0
        }
    }

    fun print() = println(this.velocity)

    fun details() = println("${this.model} custa R$ ${this.price}, e possui ${horsePower}cv")

    fun purchase(dinheiro: Double){
        when {
            dinheiro >= this.price -> println("Você pode comprar!")
            dinheiro >= 1000000.00 && dinheiro < this.price -> println("Você pode dar esse valor de $dinheiro e financiar o restante em até 12x")
            else -> println("Você não pode comprar")
        }
    }

}

fun main(){
    var porsche: Vehicle = Vehicle(0, 100, "911 GT3 RS", 525, 1769000.00)
    porsche.speed(40, 150)
    porsche.slowdown(150)
    porsche.details()
    porsche.purchase(1500000.00)
    porsche.print()
}