package oop_164970_muhammadmuzakki.week08

fun parseProduct(rawJson: Map<String, Any?>): Product? {
    val id = requireNotNull(rawJson["id"] as? String) {
        "API INVALID: Missing or invalid ID."
    }
    val name = requireNotNull(rawJson["name"] as? String) {
        "API INVALID: Missing or invalid Name."
    }
    val type = rawJson["type"] as? String
    return when (type) {
        "ELECTRONIC" -> {
            val warranty = rawJson["warranty"] as? Int ?: 12
            Product.Electronic(id, name, warranty)
        }
        "CLOTHING" -> {
            val size = rawJson["size"] as? String ?: "All Size"
            Product.Clothing(id, name, size)
        }
        else -> null
    }
}