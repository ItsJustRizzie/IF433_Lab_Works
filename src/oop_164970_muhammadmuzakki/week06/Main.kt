package oop_164970_muhammadmuzakki.week06

/**package oop_164970_muhammadmuzakki.week06

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
}**/

fun main() {
    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("L01", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== MENGAKTIFKAN MODE KEAMANAN ===")
    hub.activateSecurityMode()

    println("\n=== MEMATIKAN SEMUA SAKLAR ===")
    hub.turnOffAllSwitches()
}