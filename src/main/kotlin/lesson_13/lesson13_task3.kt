package lesson_13

class PhoneBook3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val listOfExistingCompanies = listOf<PhoneBook3>(
        PhoneBook3("Bob", 89376573398),
        PhoneBook3("Tom", 89476573399),
        PhoneBook3("Sam", 89376573101, "null"),
        PhoneBook3("Pam", 89116573333, "Flowers"),
        PhoneBook3("Ron", 89556573398, "Lilart")
    ).filter {
        it.company != null
    }

    listOfExistingCompanies.forEach { println("компания: ${it.company}") }
}
