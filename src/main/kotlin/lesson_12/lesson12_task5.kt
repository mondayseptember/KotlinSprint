package lesson_12

import kotlin.random.Random

const val DAYS_NUMBER = 30

class DailyWeather5(
    val dayTemperature: Int = (10..30).random(),
    val nightTemperature: Int = (5..20).random(),
    val precipitation: Boolean = Random.nextBoolean(),
)

fun main() {
    val monthWeatherList = mutableListOf<DailyWeather5>()

    for (i in 1..DAYS_NUMBER) {
        monthWeatherList += DailyWeather5()
    }

    val dayTemperaturesList = monthWeatherList.map { it.dayTemperature }
    val nightTemperaturesList = monthWeatherList.map { it.nightTemperature }
    val daysWithPrecipitation = monthWeatherList.filter { it.precipitation }.size

    println("среднее значение дневной температуры: ${dayTemperaturesList.averageTemperatures()}")
    println("среднее значение ночной температуры: ${nightTemperaturesList.averageTemperatures()}")
    println("количество дней с осадками: $daysWithPrecipitation")
}

fun List<Int>.averageTemperatures(): Int {
    return sum() / DAYS_NUMBER
}
