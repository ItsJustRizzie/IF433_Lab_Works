package UTS_164970_MuhammadMuzakkiRizqullah

abstract class CateringMenu(val name: String, menuCode: String, basePrice: Double) : IBillable {
    var basePrice: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] Invalid price!")
            }
        }
    var menuCode: String = ""
        get() = "UMN-$field"
        set(value) {
            field = value.uppercase()
        }

    init {
        this.basePrice = basePrice
        this.menuCode = menuCode
    }

    abstract override fun calculateSubtotal(quantity: Int): Double
    abstract override fun printMenuDetails(quantity: Int)
}

class FoodMenu(name: String, menuCode: String, basePrice: Double) :
    CateringMenu(name, menuCode, basePrice) {
    constructor(name: String, menuCode: String, basePrice: Double, bool: Boolean) : this(name, menuCode, basePrice)

    val packagingFee: Double = 3000.0
    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        println("[FOOD] $menuCode - $name")
        println("Qty: $quantity portions | Subtotal: Rp$subtotal")
    }
}

class DrinkMenu(name: String, menuCode: String, basePrice: Double, val isLargeSize: Boolean) :
    CateringMenu(name, menuCode, basePrice) {
    override fun calculateSubtotal(quantity: Int): Double {
        val effectivePrice = if (isLargeSize) basePrice + 5000.0 else basePrice; return (effectivePrice * quantity)
    }

    override fun printMenuDetails(quantity: Int) {
        val sizeLabel = if (isLargeSize) "Large" else ""
        val subtotal = calculateSubtotal(quantity)

        println("[DRINK] [$menuCode] - $name $sizeLabel")
        println("Qty: $quantity cups | Subtotal: Rp${subtotal.toInt()}")
    }
}