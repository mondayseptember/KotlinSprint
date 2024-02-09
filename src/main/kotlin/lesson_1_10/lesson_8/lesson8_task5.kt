package lesson_1_10.lesson_8

fun main() {
    println("Введите количество планируемых ингредиентов:")
    val ingredientsNumber = readln().toInt()

    var ingredientsArray = arrayOf<String>()

    println("Введите ингредиенты:")
    for (i in 1..ingredientsNumber) {
        ingredientsArray += readln()
    }

    println(ingredientsArray.size)
}
