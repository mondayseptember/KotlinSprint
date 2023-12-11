package lesson_2

fun main() {
    val cristalOreWithoutBuff = 7
    val ironOreWithoutBuff = 11
    val buffPercent = 20

    val cristalOreWithBuff = cristalOreWithoutBuff * buffPercent / 100
    val ironOreWithBuff = ironOreWithoutBuff * buffPercent / 100

    println(cristalOreWithBuff)
    println(ironOreWithBuff)
}



