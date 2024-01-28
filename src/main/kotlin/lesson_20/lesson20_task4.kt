package lesson_20

fun main() {
    val elementList = listOf("1", "2", "3", "4", "5", "6")
    elementList.map {
        if (elementList.indexOf(it) % 2 == 0) println("Нажат элемент $it")
    }
}
