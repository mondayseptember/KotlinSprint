package lesson_12

class DailyWeather2(var dayTemperature: Int, var nightTemperature: Int, var precipitation: Boolean) {

    fun printInfo() {
        println(
            "дневная температура: $dayTemperature," +
                " ночная температура: $nightTemperature," +
                " наличие осадков: $precipitation"
        )
    }
}

fun main() {
    val todayWeather = DailyWeather2(18, 15, false)
    todayWeather.printInfo()
}
