package lesson_1_10.lesson_10

const val USER_LOGIN = "Anna"
const val USER_PASSWORD = "z5rZjc"
val BASKET = listOf("apple", "orange")

fun main() {
    val token = authorization("Anna", "z5rZjc")
    println(getBasket(token))
}

fun authorization(login: String, password: String): String? {
    val token = if (login == USER_LOGIN && password == USER_PASSWORD) {
        (('0'..'9') + ('a'..'z') + ('A'..'Z'))
            .shuffled().take(32).joinToString("")
    } else {
        null
    }
    return token
}

fun getBasket(token: String?): String {
    return token?.let { BASKET.joinToString(", ") } ?: "Неудачная авторизация"
}
