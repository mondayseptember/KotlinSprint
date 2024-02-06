package lesson_21

fun main() {
    val word = "hello"
    println(word.vowelCount())
}

fun String.vowelCount(): Int {
    return count { it in "aeiou" }
}
