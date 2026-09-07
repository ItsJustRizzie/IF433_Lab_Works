package oop_164970_muhammadmuzakki.week02

class Hero(val name: String, val baseDamage: Int, var hp: Int = 100) {
    fun attack(targetName: String) {
        println("$name struck $targetName!")
    }

    fun takeDamage(damage: Int) {
       hp = (hp - damage).coerceAtLeast(0)
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}