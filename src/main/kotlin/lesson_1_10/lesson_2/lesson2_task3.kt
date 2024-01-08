package lesson_1_10.lesson_2

fun main() {
    val hourOfDepartureTime = 9
    val minuteOfDepartureTime = 39
    val durationOfWayInMinutes = 457

    val oneHourInMinutes = 60

    val arrivalTimeInMinutes = hourOfDepartureTime * oneHourInMinutes + minuteOfDepartureTime + durationOfWayInMinutes
    val hourOfArrivalTime = arrivalTimeInMinutes / oneHourInMinutes
    val minuteOfArrivalTime = arrivalTimeInMinutes % oneHourInMinutes

    println("Время прибытия поезда $hourOfArrivalTime:$minuteOfArrivalTime")
}

