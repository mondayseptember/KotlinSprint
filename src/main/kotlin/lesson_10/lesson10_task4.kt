package lesson_10

fun main() {
    var numberOfWin = 0
    do {
        val userResult = throwDice()
        val computerResult = throwDice()
        println("Кости бросает Пользователь. Количество очков: $userResult")
        println("Кости бросает Компьютер. Количество очков: $computerResult")
        printGameResult(userResult, computerResult)
        if (userResult > computerResult) numberOfWin++

        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while (readln().equals("да", ignoreCase = true))
    println("Количество выигранных партий: $numberOfWin")
}

fun throwDice(): Int {
    return (1..6).random()
}

fun printGameResult(userResult: Int, computerResult: Int) {
    when (true) {
        (userResult > computerResult) -> println("Победило человечество")
        (userResult < computerResult) -> println("Победила машина")
        else -> println("Ничья")
    }
}
