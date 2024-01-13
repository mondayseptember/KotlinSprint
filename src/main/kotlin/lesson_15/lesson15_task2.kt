package lesson_15

abstract class WeatherStationStats

class Temperature(
    val temperature: Int
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitationAmount: Int
) : WeatherStationStats()

class WeatherServer {
    fun sendMessageToServer(temperature: Int, precipitationAmount: Int) {
        println("Данные температуры: $temperature")
        println("Данные количества осадков: $precipitationAmount")
    }
}

fun main() {
    val weatherData = WeatherServer().sendMessageToServer(
        Temperature(32).temperature,
        PrecipitationAmount(420).precipitationAmount
    )
}
