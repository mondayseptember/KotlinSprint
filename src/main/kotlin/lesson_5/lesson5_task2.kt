package lesson_5

fun main() {
    val userYearOfBirth = readln()!!.toInt()
    val currentYear = 2023
    val userAge = currentYear - userYearOfBirth

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"

    println(resultText)
}

const val AGE_OF_MAJORITY = 18
