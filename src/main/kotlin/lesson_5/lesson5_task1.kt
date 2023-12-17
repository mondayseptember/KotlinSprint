package lesson_5

fun main() {
    val firstNumber = 2
    val secondNumber = 2

    val captchaText = "Напишите ответ для выражения: $firstNumber + $secondNumber"
    println(captchaText)
    val userAnswer = readln().toInt()

    if (userAnswer == (firstNumber + secondNumber)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
