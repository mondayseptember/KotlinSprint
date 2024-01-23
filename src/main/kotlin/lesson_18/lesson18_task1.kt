package lesson_18

class Order() {

    fun showInfoAboutOrder(
        orderNumber: Int,
        goods: String,
    ) {
        println("Заказан товар: $goods")
    }

    fun showInfoAboutOrder(
        orderNumber: Int,
        goods: List<String>,
    ) {
        println("Заказаны товары: $goods")
    }
}

fun main() {
    val firstOrder = Order()
    firstOrder.showInfoAboutOrder(1, "настольная игра")

    val secondOrder = Order()
    secondOrder.showInfoAboutOrder(2, listOf("кружка", "чай", "чайник"))
}
