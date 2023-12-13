package lesson_4

fun main() {
    val weatherIsSunny = true
    val tentIsOpened = true
    val airHumidity = 20
    val currentSeason = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(weatherIsSunny == true) && (tentIsOpened == true) && (airHumidity == 20) && (currentSeason != "winter")}")
}