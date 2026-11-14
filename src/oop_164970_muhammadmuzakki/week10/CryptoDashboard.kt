package oop_164970_muhammadmuzakki.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("SOL", 12.5))
    coinRepo.add(Coin("ADA", 3400.0))
    coinRepo.add(Coin("LINK", 85.0))
}