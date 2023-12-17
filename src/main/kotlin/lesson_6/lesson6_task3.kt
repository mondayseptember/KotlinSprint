package lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    var countOfSec = readln().toInt()

    while (countOfSec > 0) {
        println("Осталось секунд: ${countOfSec--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}
