package lesson_12

class DailyWeather4(var dayTemperature: Int, var nightTemperature: Int, var precipitation: Boolean) {

    init {
        println(
            "дневная температура: $dayTemperature," +
                    " ночная температура: $nightTemperature," +
                    " наличие осадков: $precipitation"
        )
    }
}

fun main() {
    val yesterdayWeather = DailyWeather4(27, 15, false)
}
