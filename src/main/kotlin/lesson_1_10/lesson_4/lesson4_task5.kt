package lesson_1_10.lesson_4

fun main() {
    println("Наличие повреждений корпуса:")
    val damaged = readln().toBoolean()

    println("Tекущий состав экипажа:")
    val crewNumber = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    val provisionsBoxes = readln().toInt()

    println("Благоприятность метеоусловий:")
    val weatherIsGood = readln().toBoolean()

    val shipSailingIsPossible = (
        (damaged == DAMAGED) &&
            (crewNumber in CREW_NUMBER_MIN..CREW_NUMBER_MAX) &&
            (provisionsBoxes > PROVISIONS_BOXES) &&
            (weatherIsGood == WEATHER_CONDITION_IS_GOOD)
        ) ||
        (
            (damaged == !DAMAGED) &&
                (crewNumber == CREW_NUMBER_MAX) &&
                (provisionsBoxes >= PROVISIONS_BOXES)
            )

    println(shipSailingIsPossible)
}

const val DAMAGED = false
const val CREW_NUMBER_MIN = 55
const val CREW_NUMBER_MAX = 70
const val PROVISIONS_BOXES = 50
const val WEATHER_CONDITION_IS_GOOD = true
