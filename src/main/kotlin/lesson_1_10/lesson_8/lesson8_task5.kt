package lesson_1_10.lesson_8

fun main() {
    println("Введите количество планируемых ингредиентов и ингредиенты:")
    val ingredientsNumber = Array(readln().toInt()) { readln() }

    println(ingredientsNumber.joinToString(", "))
}
