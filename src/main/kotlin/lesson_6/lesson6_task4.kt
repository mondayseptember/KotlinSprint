package lesson_6

fun main() {
    println("Угадайте число от 1 до 9:")
    val number = 3
    var numberOfAttempts = 5

    while (numberOfAttempts > 0) {
        numberOfAttempts--
        val userNumber = readln().toInt()
        if (userNumber == number) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно. Осталось $numberOfAttempts попыток")
            if (numberOfAttempts == 0) {
                println("Было загадано число $number")
            }
        }
    }
}
