package lesson_1_10.lesson_5

fun main() {
    println("Введите год рождения:")
    val userYearOfBirth = readln().toInt()
    val currentYear = 2023

    if ((currentYear - userYearOfBirth) >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}

const val AGE_OF_MAJORITY = 18
