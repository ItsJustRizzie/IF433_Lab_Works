package oop_164970_muhammadmuzakki.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()
    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }
}

fun <T : Nameable> WalletRepository<T>.findByName(name: String): T? {
    return getAll().find { it.name.equals(name, ignoreCase = true) }
}