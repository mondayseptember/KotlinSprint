package lesson_12

class DailyWeather3(dayTemperature: Int, nightTemperature: Int, precipitation: Boolean) {

    var dayTemperature = (dayTemperature - 273.15).toInt()
    var nightTemperature = (nightTemperature - 273.15).toInt()
    var precipitation = precipitation

    fun printInfo() {
        println(
            "дневная температура: $dayTemperature," +
                    " ночная температура: $nightTemperature," +
                    " наличие осадков: $precipitation"
        )
    }
}

fun main() {
    val yesterdayWeather = DailyWeather3(275, 260, false)
    println(yesterdayWeather.printInfo())
}
