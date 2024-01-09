package lesson_13

class Contact4(
    val name: String,
    val phoneNumber: String?,
    val company: String? = null,
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
            println("${it.name}, ${it.phoneNumber}, ${it.company}")
        }
    }
}

fun main() {
    val contact1 = Contact4("Николай", null)
    val contact2 = Contact4("Ольга", "", "Bombora")
    val contact3 = Contact4("Андрей", "89375672298", "Imaginarium")
    val contact4 = Contact4("Алина", "89375672293")

    val contactBook = ContactBook()
    contactBook.addContact(contact1)
    contactBook.addContact(contact2)
    contactBook.addContact(contact3)
    contactBook.addContact(contact4)

    contactBook.printContacts()
}
