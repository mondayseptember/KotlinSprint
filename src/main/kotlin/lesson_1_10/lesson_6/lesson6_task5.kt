package lesson_1_10.lesson_6

fun main() {
    var attemptsNumbers = 3

    do {
        println("Pешите математический пример – сложите два числа")
        val numbersForSum = (1..9).shuffled().take(2)
        val sum = numbersForSum.sum()

        println("${numbersForSum[0]} + ${numbersForSum[1]}")
        val userAnswer = readln().toIntOrNull()

        if (userAnswer == sum) {
            println("Добро пожаловать!")
            break
        } else {
            attemptsNumbers--
        }

        if (attemptsNumbers == 0) println("Доступ запрещен")
    } while (attemptsNumbers > 0)
}
