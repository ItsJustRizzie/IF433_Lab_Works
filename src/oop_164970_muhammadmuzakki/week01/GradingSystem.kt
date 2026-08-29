package oop_164970_muhammadmuzakki.week01

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

    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "Pass" else "Fail"