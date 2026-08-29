package oop_164970_muhammadmuzakki.week01

fun main() {
    val gameTitle = "Palworld"
    val price = 245999
    val finalPrice = calculateDiscount(price)

    printReceipt(gameTitle, price, finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price-(price*20/100) else price-(price*10/100)

fun printReceipt(title: String, price: Int, finalPrice: Int) {
    println("Title: $title, Price: $price, FinalPrice: $finalPrice")
}