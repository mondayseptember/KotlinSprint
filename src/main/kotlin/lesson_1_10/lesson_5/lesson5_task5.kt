package lesson_1_10.lesson_5

fun main() {
    val generatedNumbersList = (0..42).shuffled().take(3)

    println("Угадайте три числа от 0 до 42:")
    val userNumbers = listOf(readln().toInt(), readln().toInt(), readln().toInt())

    when (val coincidences = userNumbers.intersect(generatedNumbersList).count()) {
        1 -> println("Угадано $coincidences число, вы выиграли утешительный приз")
        2 -> println("Угадано $coincidences числа, вы получаете крупный приз")
        3 -> println("Угаданo $coincidences числа, вы выиграли джекпот!")
        else -> println("Вы не угадали ни одного числа")
    }
    println("Выигрышные числа $generatedNumbersList")
}
