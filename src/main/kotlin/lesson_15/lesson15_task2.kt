package lesson_15

abstract class WeatherStationStats

class Temperature(
    val temperature: Int
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitationAmount: Int
) : WeatherStationStats()

class WeatherServer {
    fun sendMessageToServer(weatherData: WeatherStationStats) {
        when (weatherData) {
            is Temperature -> println("Данные температуры: ${weatherData.temperature}")
            is PrecipitationAmount -> println("Данные количества осадков: ${weatherData.precipitationAmount}")
        }
    }
}

fun main() {
    val weatherData = WeatherServer()
    weatherData.sendMessageToServer(Temperature(33))
    weatherData.sendMessageToServer(PrecipitationAmount(420))
}
