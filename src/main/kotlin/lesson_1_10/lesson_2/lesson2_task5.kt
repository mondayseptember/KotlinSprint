package lesson_1_10.lesson_2

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    val interestRate = 16.7
    val depositTerm = 20

    val compoundInterest = depositAmount * (1 + interestRate / 100).pow(depositTerm)
    println(("%.3f".format(compoundInterest)))
}
