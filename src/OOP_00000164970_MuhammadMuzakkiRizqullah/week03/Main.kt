package OOP_00000164970_MuhammadMuzakkiRizqullah.week03

/*fun main() {
    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}*/

/*fun main() {
    val w = Weapon("Railgun")

    w.damage = 9999

    println("Weapon name: ${w.name}")
    println("Weapon damage: ${w.damage}")
    println("Weapon tier: ${w.tier}")
}*/

fun main() {
    val player1 = Player("ILoveJunoBeastars")

    println("\nAdded 50 XP")
    player1.addXp(50)
    println("Current Level: ${player1.level}")

    println("Added 60 more XP")
    player1.addXp(60)
}