package oop_164970_muhammadmuzakki.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0
    open fun accelerate() {
        speed += 10
        println("$brand accelerated. Speed: $speed km/h")
    }

    open fun honk() {
        println("Beep! Beep!")
    }
}

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Trunk of $brand with $numberOfDoors door(s) is opened.")
    }

    override fun honk() {
        println("HONK! HONK! A $brand car is passing through!")
    }
}