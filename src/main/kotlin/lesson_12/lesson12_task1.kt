package lesson_12

class DailyWeather {
    var dayTemperature = 20
    var nightTemperature = 8
    var precipitation = false

    fun printInfo() {
        println(
            "дневная температура: $dayTemperature, " +
                    "ночная температура: $nightTemperature, " +
                    "наличие осадков: $precipitation"
        )
    }
}

fun main() {
    val yesterdayWeather = DailyWeather()
    yesterdayWeather.dayTemperature = 15
    yesterdayWeather.nightTemperature = 6
    yesterdayWeather.precipitation = true
    yesterdayWeather.printInfo()

    val todayWeather = DailyWeather()
    todayWeather.dayTemperature = 19
    todayWeather.nightTemperature = 8
    todayWeather.precipitation = false
    todayWeather.printInfo()
}
