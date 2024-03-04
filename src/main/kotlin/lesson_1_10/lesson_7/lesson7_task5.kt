package lesson_1_10.lesson_7

fun main() {
    val valuesForPasswordGenerate = (('0'..'9') + ('a'..'z') + ('A'..'Z'))
    val passwordLengthMin = 6

    println("Введите длину пароля, минимальная длина пароля 6 символов:")
    val userLength = readln().toInt()

    val generatedPassword = if (userLength >= passwordLengthMin) {
        valuesForPasswordGenerate.shuffled().take(userLength).joinToString("")
    } else {
        println("Минимальная длина пароля 6 символов")
        valuesForPasswordGenerate.shuffled().take(6).joinToString("")
    }
    println(generatedPassword)
}
