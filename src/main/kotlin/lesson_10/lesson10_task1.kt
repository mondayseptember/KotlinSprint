package lesson_10

fun main() {
    val userResult = throwDice()
    val computerResult = throwDice()

    println("Кости бросает Пользователь. Количество очков: $userResult")
    println("Кости бросает Компьютер. Количество очков: $computerResult")

    if (userResult > computerResult) {
        println("Победило человечество")
    } else if (userResult < computerResult) {
        println("Победила машина")
    } else {
        println("Ничья")
    }
}

fun throwDice(): Int {
    return (1..6).random()
}
