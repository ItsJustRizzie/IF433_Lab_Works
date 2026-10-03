package oop_164970_muhammadmuzakki.week06

class GoPay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via GoPay server.")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting bank for Rp$amount.")
    }
}