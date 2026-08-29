package OOP_00000164970_MuhammadMuzakkiRizqullah.week01

fun main() {
    val name = "John Thor"
    val score = 80

    println("Name: $name, Score: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Your Grade: $grade")
}