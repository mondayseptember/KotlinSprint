package lesson_13

class Contact3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val listOfExistingCompanies = listOf<Contact3>(
        Contact3("Bob", 89376573398),
        Contact3("Tom", 89476573399),
        Contact3("Sam", 89376573101, "null"),
        Contact3("Pam", 89116573333, "Flowers"),
        Contact3("Ron", 89556573398, "Lilart")
    ).filter {
        it.company != null
    }

    listOfExistingCompanies.forEach { println("компания: ${it.company}") }
}
