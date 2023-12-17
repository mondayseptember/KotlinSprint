package lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    var countOfSec = readln().toInt()
    val userValue = countOfSec

    while (countOfSec > 0) {
        countOfSec--
        Thread.sleep(1000)
    }
    println("Прошло $userValue секунд")
}

