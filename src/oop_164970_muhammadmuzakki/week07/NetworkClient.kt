package oop_164970_muhammadmuzakki.week07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan base URL: $BASE_URL")
            return NetworkClient("$BASE_URL")
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}