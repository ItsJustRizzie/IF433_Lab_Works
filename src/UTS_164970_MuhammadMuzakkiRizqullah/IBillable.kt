package UTS_164970_MuhammadMuzakkiRizqullah

interface IBillable {
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}