package lesson_4

fun main() {
    val bookedTablesForToday = 13
    val bookedTablesForTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${bookedTablesForToday < NUMBER_OF_TABLES}" + "\n" + "Доступность столиков на завтра: ${bookedTablesForTomorrow < NUMBER_OF_TABLES}"
    )
}

const val NUMBER_OF_TABLES = 13
