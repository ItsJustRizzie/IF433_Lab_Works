package UTS_164970_MuhammadMuzakkiRizqullah

import java.util.Scanner

fun main() {
    val nasiGoreng = FoodMenu("Nasi Goreng Spesial", "nsg01", -15000.0)
    nasiGoreng.basePrice = 25000.0
    val ayamBakar = FoodMenu("Ayam Bakar Madu", "aym02", 35000.0)
    val esTehLemon = DrinkMenu("Es Teh Lemon", "lem01", 8000.0, true)

    val menuCatalog: List<CateringMenu> = listOf(nasiGoreng, ayamBakar, esTehLemon)

    val scanner = Scanner(System.`in`)

    println("===== UMN CATERING MANAGER SYSTEM =====")
    println("Enter customer name: ")
    val name = scanner.nextLine()
    println("Enter phone number: ")
    val phone = scanner.nextLine()
    println("Enter delivery address: ")
    val address = scanner.nextLine()

    val customer = Customer(name, phone, address)
    val order = CateringOrder(customer)

    while (true) {
        println()
        println("=============== MENU ===============")
        for (i in menuCatalog.indices) {
            println("${i + 1}.  ${menuCatalog[i].name}")
        }
        println("0. Finish Order")
        println("Choose Menu: ")
        val choice = scanner.nextInt()
        if (choice == 0) {
            break
        }
        if (choice in 1..menuCatalog.size) {
            val selectedMenu = menuCatalog[choice - 1]
            print("Enter quantity: ")
            val quantity = scanner.nextInt()
            order.addMenuToOrder(selectedMenu, quantity)
        } else {
            println("[Error] Invalid menu choice!")
        }
    }
    order.status = OrderStatus.COOKING
    order.printInvoice()
    scanner.close()
}