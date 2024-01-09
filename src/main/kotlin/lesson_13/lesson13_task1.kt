package lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val number = Contact("Elena", 83474892367, null)
    println("имя: ${number.name}, номер телефона: ${number.phoneNumber}, компания: ${number.company}")
}
