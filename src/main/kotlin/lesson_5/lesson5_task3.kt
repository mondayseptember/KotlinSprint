package lesson_5

fun main() {
    println("Для участия в лотереи необходимо ввести 2 числа от 0 до 42. Введите первое число:")

    val firstUserNumber = readln()!!.toInt()
    println("Введите второе число:")
    val secondUserNumber = readln()!!.toInt()

    val firstNumber = 1
    val secondNumber = 3

    val firstCondition = firstUserNumber == firstNumber || secondUserNumber == firstNumber
    val secondCondition = firstUserNumber == secondNumber || secondUserNumber == secondNumber
    val thirdCondition = firstUserNumber == firstNumber && secondUserNumber == secondNumber

    if ((firstCondition && secondCondition) || thirdCondition) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstCondition || secondCondition) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Были загаданы числа $firstNumber и $secondNumber")
}
