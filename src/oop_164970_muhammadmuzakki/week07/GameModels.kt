package oop_164970_muhammadmuzakki.week07

enum class itemRarity(val dropChance: Int) {
    COMMON(33), UNCOMMON(26), RARE(20), EPIC(13), LEGENDARY(6);
}

data class gameItem(val name: String, val damage: Int, val rarity: itemRarity)