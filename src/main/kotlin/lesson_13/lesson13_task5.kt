package lesson_13

class Contact5(
    val name: String,
    val phoneNumber: String,
    val company: String? = null,
)

fun main() {
    val contact = Contact5(readln(), readln())

    try {
        contact.phoneNumber.toLong()
    } catch (e: NumberFormatException) {
        println("NumberFormatException")
    }
}
