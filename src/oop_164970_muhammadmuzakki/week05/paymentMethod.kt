package oop_164970_muhammadmuzakki.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double): Boolean
}

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    fun topUp(amount: Double) {
        balance += amount
        println("Top up $amount successful. Current balance: $balance")
    }

    override fun processPayment(amount: Double): Boolean {
        if (balance < amount) {
            println("=> Saldo kurang ($balance < $amount). Mencoba top up otomatis...")
            topUp(50000.0)
        }

        return if (balance >= amount) {
            balance -= amount
            println("Pembayaran $amount berhasil. Sisa saldo: $balance")
            true
        } else {
            println("Pembayaran gagal: Saldo tetap tidak cukup.")
            false
        }
    }
}

class CreditCard(accountName: String, var limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double): Boolean {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaction successful. Remaining card limit: ${limit - usedAmount}")
            return true
        } else {
            println("Transaction canceled. Card limit reached!")
            return false
        }
    }
}