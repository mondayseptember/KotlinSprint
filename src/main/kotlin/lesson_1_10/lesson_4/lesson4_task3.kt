package lesson_1_10.lesson_4

fun main() {
    val weatherIsSunny = true
    val tentIsOpened = true
    val airHumidity = 20
    val currentSeason = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (weatherIsSunny == WEATHER_IS_SUNNY) &&
                    (tentIsOpened == TENT_IS_OPENED) &&
                    (airHumidity == AIR_HUMIDITY) &&
                    (currentSeason != CURRENT_SEASON)
        }"
    )
}

const val WEATHER_IS_SUNNY = true
const val TENT_IS_OPENED = true
const val AIR_HUMIDITY = 20
const val CURRENT_SEASON = "winter"
