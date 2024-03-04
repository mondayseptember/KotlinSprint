package lesson_1_10.lesson_9

fun main() {
    println("Нвпишите название 5 ингредиентов:")
    val userIngredients = mutableListOf<String>()

    for (i in 1..5) {
        userIngredients.add(readln())
    }
    val ingredientslist = userIngredients.toSet().sorted().joinToString(", ").capitalize()
    println(ingredientslist)
}
