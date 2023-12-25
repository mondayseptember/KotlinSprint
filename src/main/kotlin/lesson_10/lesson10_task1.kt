package lesson_10

fun main() {
    val userResult = throwDice()
    val computerResult = throwDice()

    println("Кости бросает Пользователь. Количество очков: $userResult")
    println("Кости бросает Компьютер. Количество очков: $computerResult")

    when (true) {
        (userResult > computerResult) -> println("Победило человечество")
        (userResult < computerResult) -> println("Победила машина")
        else -> println("Ничья")
    }
}

fun throwDice(): Int {
    return (1..6).random()
}
