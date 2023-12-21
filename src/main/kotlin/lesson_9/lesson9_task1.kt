package lesson_9

fun main() {
    val listOfIngredients =
        listOf("свекла", "морковь", "зеленый горошек", "лук", "картофель", "растительное масло", "соль")

    println("В рецепте есть следующие ингредиенты: ")
    listOfIngredients.forEach {
        println(it)
    }
}
