package UTS_164970_MuhammadMuzakkiRizqullah

import java.text.NumberFormat
import java.util.Locale

class CateringOrder(val customer: Customer) {
    var status: OrderStatus = OrderStatus.WAITING_LIST
    private val orderItems: MutableList<Pair<CateringMenu, Int>> = mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
    }

    fun printInvoice() {
        println("=============== INVOICE ===============")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println("Order Status: $status")

        var grandTotal = 0.0
        var itemNumber = 1

        for ((menu, qty) in orderItems) {
            print("$itemNumber. ")
            menu.printMenuDetails(qty)
            grandTotal += menu.calculateSubtotal(qty)
            itemNumber++
        }
        val formatter = NumberFormat.getCurrencyInstance(Locale("id", "ID")).apply{
            maximumFractionDigits = 0
        }
        println("GRAND TOTAL: ${formatter.format(grandTotal)}")
        println("=======================================")
    }
}