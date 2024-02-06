package lesson_22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook("To Kill a Mockingbird", "Harper Lee")
    val regularBook2 = RegularBook("To Kill a Mockingbird", "Harper Lee")

    val dataBook1 = DataBook("To Kill a Mockingbird", "Harper Lee")
    val dataBook2 = DataBook("To Kill a Mockingbird", "Harper Lee")

    // Обычный класс RegularBook сравнивает ссылки на объекты в памяти, а не значения
    println(regularBook1 == regularBook2)

    // data class DataBook сравнивает именно проинициализированные значения
    println(dataBook1 == dataBook2)
}
