package lesson_21

fun main() {
    val numbersList = listOf<Int>(4, 5, 8).evenNumbersSum()

    println(numbersList)
}

fun List<Int>.evenNumbersSum(): Int {
    val sum = filter {
        it % 2 == 0
    }.sum()
    return sum
}
