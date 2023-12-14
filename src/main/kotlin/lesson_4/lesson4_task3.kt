package lesson_4

fun main() {
    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${(WEATHER_IS_SUNNY == true) && 
                    (TENT_IS_OPENED == true) &&
                    (AIR_HUMIDITY == 20) &&
                    (CURRENT_SEASON != "winter")}"
    )
}

const val WEATHER_IS_SUNNY = true
const val TENT_IS_OPENED = true
const val AIR_HUMIDITY = 20
const val CURRENT_SEASON = "winter"
