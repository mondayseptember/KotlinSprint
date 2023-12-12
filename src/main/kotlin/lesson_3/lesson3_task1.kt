package lesson_3

fun main() {
    val greetingForDay = "Добрый день"
    val greetingForNight = "Добрый вечер"
    val userName = "Пользователь"

    var greetingWithUserName: String

    greetingWithUserName = "$greetingForDay, $userName!"
    println(greetingWithUserName)

    greetingWithUserName = "$greetingForNight, $userName!"
    println(greetingWithUserName)
}