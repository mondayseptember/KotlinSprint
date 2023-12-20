package lesson_8

fun main() {
    val arrayOfIngredients =
        arrayOf("свекла", "морковь", "зеленый горошек", "лук", "картофель", "растительное масло", "соль")

    for (i in arrayOfIngredients) {
        println(i)
    }

    println("Напишите название ингредиента, который хотите заменить:")
    val ingredientForReplace = readln()

    for (i in arrayOfIngredients) {
        if (i == ingredientForReplace) {
            println("Напишите ингредиент, который хотели бы добавить:")

            val ingredientToAdd = readln()
            arrayOfIngredients[arrayOfIngredients.indexOf(i)] = ingredientToAdd

            println("Готово! Вы сохранили следующий список:")
            for (i in arrayOfIngredients) {
                println(i)
            }
            return
        }
    }
    println("Ингредиента нет в списке")
}
