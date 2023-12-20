package lesson_8

fun main() {
    val ingredientsForVinegret =
        arrayOf("свекла", "морковь", "зеленый горощек", "лук", "картофель", "растительное масло", "соль")
    println("Введите название ингредиента, который вы хотите найти:")
    val infoAboutIngredients = readln()

    if (ingredientsForVinegret.indexOf(infoAboutIngredients) >= 0) {
        println("Ингредиент \"$infoAboutIngredients\" в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}

