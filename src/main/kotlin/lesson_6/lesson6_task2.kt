package lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    val countOfSec = readln().toInt()

    Thread.sleep(1000 * countOfSec.toLong())

    println("Прошло $countOfSec секунд")
}

