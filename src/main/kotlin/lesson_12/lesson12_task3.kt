package lesson_12

const val ZERO_KELVIN = 273.15

class DailyWeather3(dayTemperature: Int, nightTemperature: Int, precipitation: Boolean) {

    var dayTemperature = (dayTemperature - ZERO_KELVIN).toInt()
    var nightTemperature = (nightTemperature - ZERO_KELVIN).toInt()
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
