package oop_164970_muhammadmuzakki.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("SOL", 12.5))
    coinRepo.add(Coin("ADA", 3400.0))
    coinRepo.add(Coin("LINK", 85.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")
    println("\nDaftar aset koin:")
    response.data.forEach { coin -> println("${coin.name}: ${coin.balance}") }
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 7.483))
    txRepo.add(Transaction("TX-002", 2.916))
    txRepo.add(Transaction("TX-003", 9.257))
}