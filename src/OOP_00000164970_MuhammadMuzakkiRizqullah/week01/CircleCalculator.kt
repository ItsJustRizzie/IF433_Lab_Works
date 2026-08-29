package OOP_00000164970_MuhammadMuzakkiRizqullah.week01

fun main() {
    val radius = 70
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a big circle.")
    } else {
        println("This is a small circle.")
    }
}