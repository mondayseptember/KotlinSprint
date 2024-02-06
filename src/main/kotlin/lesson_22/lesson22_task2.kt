package lesson_22

class RegularBook2(
    val name: String,
    val author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook = RegularBook2("To Kill a Mockingbird", "Harper Lee")
    val dataBook = DataBook2("To Kill a Mockingbird", "Harper Lee")

    // В случае обычного класса отображается строковое представление объекта по умолчанию
    println(regularBook)

    // data class позволяет увидеть данные объекта
    println(dataBook)
}
