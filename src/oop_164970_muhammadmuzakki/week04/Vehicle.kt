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
