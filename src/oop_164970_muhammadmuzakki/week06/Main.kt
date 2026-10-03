package oop_164970_muhammadmuzakki.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()
    val myPhone = Smartphone()
    myPhone.turnOn()
    val pay = GoPay()
    val pay1 = CreditCard()
    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay, 50000.0)
    processCheckout(pay1, 150000.0)
}
