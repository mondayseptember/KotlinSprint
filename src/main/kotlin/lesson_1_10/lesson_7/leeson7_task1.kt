package lesson_1_10.lesson_7

fun main() {
    val passwordLength = 1..6
    val charRange = 'a'..'z'
    val intRange = 0..9
    var password = ""

    for (i in passwordLength) {
        if (i % 2 == 0) {
            password += intRange.random()
        } else {
            password += charRange.random()
        }
    }
    println(password)
}
