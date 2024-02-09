package lesson_1_10.lesson_3

fun main() {
    val data = "D2-D4;0"
    val (whereFrom, whereTo, moveNumber) = data.split("-", ";")

    println(whereFrom)
    println(whereTo)
    println(moveNumber)
}
