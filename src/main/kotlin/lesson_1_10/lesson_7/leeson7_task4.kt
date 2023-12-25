package lesson_1_10.lesson_7

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    val countOfSec = readln().toInt()

    for (i in countOfSec downTo 1) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло")
}
