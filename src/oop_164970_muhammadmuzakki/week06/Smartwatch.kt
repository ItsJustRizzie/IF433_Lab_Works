package oop_164970_muhammadmuzakki.week06

import java.net.ConnectException

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15 W.")
    }
}