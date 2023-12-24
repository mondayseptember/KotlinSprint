package lesson_10

fun main() {
    var numberOfWin = 0
    do {
        val userResult = throwDice()
        val computerResult = throwDice()
        printInfoAboutGame("User", "Computer", userResult, computerResult)

        if (userResult > computerResult) {
            println("Победило человечество")
            numberOfWin++
        } else if (userResult < computerResult) {
            println("Победила машина")
        } else {
            println("Ничья")
        }

        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while (readln().equals("да", ignoreCase = true))

    println("Количество выигранных партий: $numberOfWin")
}

fun throwDice(): Int {
    return (1..6).random()
}

fun printInfoAboutGame(player1: String, player2: String, resultPlayer1: Int, resultPlayer2: Int) {
    println("Кости бросает $player1. Количество очков: $resultPlayer1")
    println("Кости бросает $player2. Количество очков: $resultPlayer2")
}
