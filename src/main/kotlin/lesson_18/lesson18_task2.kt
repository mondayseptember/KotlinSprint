package lesson_18

abstract class Dice {

    abstract var diceSide: Int
    abstract fun diceRoll(): String
}

class FourthSidedDice : Dice() {
    override var diceSide = 4
    override fun diceRoll(): String {
        return "Кубик с $diceSide гранями: ${(1..diceSide).random()}"
    }
}

class SixSidedDice : Dice() {
    override var diceSide = 6
    override fun diceRoll(): String {
        return "Кубик с $diceSide гранями: ${(1..diceSide).random()}"
    }
}

class EighthSidedDice : Dice() {
    override var diceSide = 8
    override fun diceRoll(): String {
        return "Кубик с $diceSide гранями: ${(1..diceSide).random()}"
    }
}

fun main() {
    val four: Dice = FourthSidedDice()
    val six: Dice = SixSidedDice()
    val eight: Dice = EighthSidedDice()

    val arrayOfDices: Array<Dice> = arrayOf(four, six, eight)

    arrayOfDices.forEach {
        println(it.diceRoll())
    }
}
