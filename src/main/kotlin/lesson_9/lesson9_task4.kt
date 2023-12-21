package lesson_9

fun main() {
    println("Напишите 5 ингредиентов, перечисленных через “,”")
    val listOfIngredients = listOf("", "", "", "", "")
    val listOfIngredientsFromUser: List<String> = listOfIngredients.map {
        readln()
    }
    println(listOfIngredientsFromUser.sorted())
}
