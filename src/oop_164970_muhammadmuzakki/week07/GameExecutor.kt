package oop_164970_muhammadmuzakki.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Kamu bertemu ${event.monsterName}!")
        is BattleState.LootDropped -> println("Kamu mendapat ${event.item.name} (Rarity: ${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over! ${event.reason}")
        BattleState.SafeZone -> println("Kamu berada di zona aman!")
    }
}