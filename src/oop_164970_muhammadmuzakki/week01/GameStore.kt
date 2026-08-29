package oop_164970_muhammadmuzakki.week01

fun main() {
    val gameTitle = "Palworld"
    val price = 245999
    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price-(price*20/100) else price-(price*10/100)