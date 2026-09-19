package oop_164970_muhammadmuzakki.week04

/*fun main() {
    println("--- TESTING VEHICLE ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- TESTING CAR ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}*/ //LAB PRACTICUM

/*fun main() {
    println("--- TESTING EV ---")
    val myCar = ElectricCar("Tesla", 4, 100)
    myCar.accelerate()
    myCar.honk()
    myCar.openTrunk()
}*/ //ASSIGNMENT 1

fun main() {
    println("--- TESTING MANAGER ---")
    val manager = Manager("Boss", baseSalary = 10000000)
    manager.work()
    println("Bonus: Rp${manager.calculateBonus()}")

    println("--- TESTING DEVELOPER ---")
    val developer = Developer("Rache Bartmoss", baseSalary = 8000000, programmingLanguage = "C++")
    developer.work()
    println("Bonus: Rp${developer.calculateBonus()}")
}