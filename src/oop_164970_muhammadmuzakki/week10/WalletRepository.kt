package oop_164970_muhammadmuzakki.week10

class WalletRepository<T> {
    val items = mutableListOf<T>()
    fun add(item: T) {}
    fun getAll(): List<T> {}
}