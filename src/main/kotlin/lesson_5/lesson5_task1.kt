package lesson_5

fun main() {
    val captchaText = "Напишите ответ для выражения: 2 + 2"
    println(captchaText)
    val correctAnswer = 4
    val userAnswer = readln()!!.toInt()

    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
