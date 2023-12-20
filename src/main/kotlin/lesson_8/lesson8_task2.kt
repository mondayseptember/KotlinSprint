package lesson_8

fun main() {
    val ingredientsForVinegret =
        arrayOf("свекла", "морковь", "зеленый горощек", "лук", "картофель", "растительное масло", "соль")
    println("Введите название ингредиента, который вы хотите найти:")
    val infoAboutIngredients = readln()

    for (i in ingredientsForVinegret) {
        if (i == infoAboutIngredients) {
            println("Ингредиент \"$i\" в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}
