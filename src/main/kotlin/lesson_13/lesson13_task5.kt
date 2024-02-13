package lesson_13

class Contact5(
    val name: String = readln(),
    val phoneNumber: String = readln(),
    val company: String = readln(),
)

fun main() {
    val contact = Contact5()

    try {
        contact.phoneNumber.toLong()
    } catch (e: NumberFormatException) {
        println("NumberFormatException")
    }
}
