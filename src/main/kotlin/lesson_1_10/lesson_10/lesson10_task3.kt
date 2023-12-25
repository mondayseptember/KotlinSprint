package lesson_1_10.lesson_10

fun main() {
    println("Введите желаемую длину пароля:")
    val userPasswordLength = readln().toInt()
    println(generatePassword(userPasswordLength))
}

fun generatePassword(length: Int): String {
    var password = ""
    for (i in 1..length) {
        password += if (i % 2 == 0) {
            (0..9).random()
        } else {
            ("!\"#$%&'()*+,-./ ").random()
        }
    }
    return password
}
