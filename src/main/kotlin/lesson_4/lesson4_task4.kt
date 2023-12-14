package lesson_4

fun main() {
    val dayOfTraining = 5
    val evenDays = dayOfTraining % 2 == 0
    val oddDays = !evenDays

    println("""  
    Упражнения для рук:       $oddDays
    Упражнения для ног:       $evenDays
    Упражнения для спины:  $evenDays
    Упражнения для пресса: $oddDays
    """.trimIndent()
    )
}