package lesson_4

fun main() {
    val dayOfTraining = 5
    val evenDays = dayOfTraining % 2 == 0

    println(
        """  
    Упражнения для рук:       ${!evenDays}
    Упражнения для ног:       $evenDays
    Упражнения для спины:  $evenDays
    Упражнения для пресса: ${!evenDays}
        """.trimIndent()
    )
}
