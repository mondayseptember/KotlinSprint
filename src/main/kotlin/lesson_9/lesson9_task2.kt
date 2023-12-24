package lesson_9

fun main() {
    val listOfFruits = mutableListOf("яблоко", "апельсин", "груша")

    println("В рецепте есть базовые ингредиенты:")
    listOfFruits.forEach {
        println(it)
    }

    println("Желаете добавить еще?")

    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val usersIngredient = readln()
        listOfFruits.add(usersIngredient)

        println("Теперь в рецепте есть следующие ингредиенты:")
        listOfFruits.forEach {
            println(it)
        }
    } else {
        return
    }
}
