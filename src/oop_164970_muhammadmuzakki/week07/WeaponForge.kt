package oop_164970_muhammadmuzakki.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Lightsaber Anakin", 150, ItemRarity.EPIC)
            return Weapon(epicItem, 1000)
        }
    }
}