package lesson_1_10.lesson_9

fun main() {
    println("Напишите 5 ингредиентов, перечисленных через “,”")
    val userIngredients = readln().split(", ")
    println(userIngredients.sorted())
}
