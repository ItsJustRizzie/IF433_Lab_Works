package oop_164970_muhammadmuzakki.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTC", "HIGH", 20, 25.5, "CLOSED"),
        TradeLog("ETH", "MEDIUM", 15, -8.2, "CLOSED"),
        TradeLog("SOL", "HIGH", 50, 112.75, "OPEN"),
        TradeLog("XRP", "LOW", 100, 3.4, "CLOSED"),
        TradeLog("DOGE", "MEDIUM", 200, -15.9, "CLOSED"),
        TradeLog("ADA", "LOW", 75, 9.1, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0.0 }
    val losingTrades = closedTrades.filter { it.roe <= 0.0 }
    val topPerformers = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val worstPerformers = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
}