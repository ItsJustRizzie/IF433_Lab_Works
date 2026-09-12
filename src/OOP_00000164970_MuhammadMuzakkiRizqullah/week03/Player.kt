package OOP_00000164970_MuhammadMuzakkiRizqullah.week03

import kotlin.collections.plusAssign
import kotlin.text.compareTo

class Player(val username: String) {
    private var xp: Int = 0
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            if (amount > 0) {
                val previousLevel = level
                xp += amount
                if (level > previousLevel) {
                    println("Level up! Congratulations, $username levelled up to level $level")
                }
            }
        }
    }
}