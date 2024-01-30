package lesson_22

data class Book(
    val name: String,
    val author: String,
    val numberOfParts: String,
)

fun main() {
    val book = Book("Harry Potter", "J. K. Rowling", "7")

    val(name: String, author: String, numberOfParts: String) = book

    println("Название: $name, автор $author, количество частей: $numberOfParts")
}
