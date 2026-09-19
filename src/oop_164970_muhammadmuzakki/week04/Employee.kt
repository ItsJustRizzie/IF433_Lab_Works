package oop_164970_muhammadmuzakki.week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name is working.")
    }

    open fun calculateBonus(): Int {
        return baseSalary * 10 / 100
    }
}

open class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work() {
        println("$name is leading a divisional meeting.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}

open class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    override fun work() {
        println("$name is using $programmingLanguage.")
    }
}