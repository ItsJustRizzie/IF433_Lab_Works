package oop_164970_muhammadmuzakki.week01

fun main (args: Array<String>) {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println("Size: ${checkSize(area)}")
}

fun checkSize(area: Double): String = if (area > 100) "This is a big circle." else "This is a small circle."