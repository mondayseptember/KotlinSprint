package lesson_19

class Goods(
    val name: String,
    val id: Int,
    val category: Category,
) {

    fun goodsInfo() {
        println("название товара: $name, id: $id, категория: ${category.getName()}")
    }
}

enum class Category(val categoryName: String) {
    CLOTHES("одежда"),
    STATIONERY("канцелярские товары"),
    OTHER("разное");

    fun getName(): String {
        return categoryName
    }
}

fun main() {
    val item1 = Goods("конструктор", 1223, Category.OTHER).goodsInfo()
    val item2 = Goods("ручка", 1224, Category.STATIONERY).goodsInfo()
    val item3 = Goods("худи", 1225, Category.CLOTHES).goodsInfo()
}
