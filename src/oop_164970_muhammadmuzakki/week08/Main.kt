package oop_164970_muhammadmuzakki.week08

fun main() {
    println("===== TEST SAFE CALLS & ELVIS =====")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui."
    println("Tujuan pengiriman: $destination")

    println("\n===== TEST LET BLOCK =====")
    val validOrder = Order(null, 2500000)
    val receipt = validOrder.totalPrice?.let {price ->
        val tax = price * 0.11
        "Transaksi valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi invalid: Harga belum di-set!"
    println(receipt)

    println("\n===== TEST SAFE CASTING =====")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )
    for (item in mixedData) {
        val text = item as? String
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }
}