package lesson_18

open class Dice {

    open fun diceRoll() = ""

    class FourthSidedDice : Dice() {
        override fun diceRoll(): String {
            return "Кубик с 4 гранями: ${(1..4).random()}"
        }
    }

    class SixSidedDice : Dice() {
        override fun diceRoll(): String {
            return "Кубик с 6 гранями: ${(1..6).random()}"
        }
    }

    class EighthSidedDice : Dice() {
        override fun diceRoll(): String {
            return "Кубик с 8 гранями: ${(1..8).random()}"
        }
    }
}

fun main() {
    val four: Dice = Dice.FourthSidedDice()
    val six: Dice = Dice.SixSidedDice()
    val eight: Dice = Dice.EighthSidedDice()

    val arrayOfDices: Array<Dice> = arrayOf(four, six, eight)

    arrayOfDices.forEach {
        println(it.diceRoll())
    }
}
