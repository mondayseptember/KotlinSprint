package lesson_8

fun main() {
    val ingredientsForVinegret =
        arrayOf("свекла", "морковь", "зеленый горошек", "лук", "картофель", "растительное масло", "соль")
    println("Введите название ингредиента, который вы хотите найти:")
    val infoAboutIngredients = readln()

    if (infoAboutIngredients in ingredientsForVinegret) {
        println("Ингредиент \"$infoAboutIngredients\" в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
