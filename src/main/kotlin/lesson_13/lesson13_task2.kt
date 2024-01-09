package lesson_13

class PhoneBook2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("имя: $name, номер: $phoneNumber, компания: ${company ?: "не указано"}")
    }
}

fun main() {
    val number = PhoneBook2("Elena", 83474892367)
    number.printInfo()
}
