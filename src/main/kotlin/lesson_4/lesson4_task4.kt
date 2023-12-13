package lesson_4

fun main() {
    val dayOfTraining = 5
    val evenDays = 0
    val oddDays = 1

    println("""    
    Упражнения для рук:       ${dayOfTraining % 2 == oddDays}
    Упражнения для ног:       ${dayOfTraining % 2 == evenDays}
    Упражнения для спины:  ${dayOfTraining % 2 == evenDays}
    Упражнения для пресса: ${dayOfTraining % 2 == oddDays}
    """.trimIndent())
}