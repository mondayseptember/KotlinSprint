package lesson_13

class Contact4(
    val name: String = readln(),
    val phoneNumber: String? = readln(),
    val company: String? = readln(),
)

class ContactBook {
    var contactList: MutableList<Contact4> = mutableListOf()

    fun addContact(contact: Contact4) {
        val phoneNumber = contact.phoneNumber?.toLongOrNull()
        if (phoneNumber == null) {
            println("Введите номер телефона")
        } else {
            contactList.add(contact)
        }
    }

    fun printContacts() {
        contactList.forEach {
            when (it.company.isNullOrEmpty()) {
                true -> println("${it.name}, ${it.phoneNumber}, null")
                false -> println("${it.name}, ${it.phoneNumber}, ${it.company}")
            }
        }
    }
}

fun main() {
    val contactList = listOf(
        Contact4()
    )
    val contactBook = ContactBook()

    for (i in contactList) {
        contactBook.addContact(i)
    }
    contactBook.printContacts()
}
