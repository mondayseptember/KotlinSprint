package lesson_16

class Dice {
    private var randomNumber = (1..6).random()

    fun getRandomNumber() = println(randomNumber)
}

fun main() {
    Dice().getRandomNumber()
}
