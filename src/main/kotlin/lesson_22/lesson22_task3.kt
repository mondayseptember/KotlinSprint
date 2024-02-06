package lesson_22

data class Book(
    val name: String,
    val author: String,
    val numberOfParts: Int,
)

fun main() {
    val book = Book("Harry Potter", "J. K. Rowling", 7)

    val(name, author, numberOfParts) = book

    println("Название: $name, автор $author, количество частей: $numberOfParts")
}
