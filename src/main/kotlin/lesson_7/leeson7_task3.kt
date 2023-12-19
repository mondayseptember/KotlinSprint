package lesson_7

fun main() {
    println("Введите число:")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2) {
        if (i == 0) {
            continue
        }
        println(i)
    }
}
