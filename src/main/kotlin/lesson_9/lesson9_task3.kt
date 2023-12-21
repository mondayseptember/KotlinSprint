package lesson_9

fun main() {
    val countOfIngredientsForOmelette = mutableListOf(2, 50, 15)

    println("Введите количество порций:")
    val numberOfPortion = readln().toInt()
    val portionOfIngredientsForOmelette = countOfIngredientsForOmelette.map { it * numberOfPortion }
    println(
        "На $numberOfPortion порций вам понадобится: " +
                "Яиц – ${portionOfIngredientsForOmelette[0]}, " +
                "молока – ${portionOfIngredientsForOmelette[1]}, " +
                "сливочного масла – ${portionOfIngredientsForOmelette[2]}"
    )
}
