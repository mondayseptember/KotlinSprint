package lesson_1_10.lesson_7

fun main() {
    do {
        val smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode")
        println("Введите код, чтобы авторизоваться:")
        val userCode = readln().toInt()
    } while (userCode != smsCode)
    println("Добро пожаловать!")
}
