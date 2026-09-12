package OOP_00000164970_MuhammadMuzakkiRizqullah.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) println("Damage cannot be negative!") else if (value > 1000) field = 1000 else value
        }
    val tier: String
        get() = if (damage > 800) "Legendary" else if (damage > 500) "Epic" else "Common"
}