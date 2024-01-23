package lesson_19

class Goods(
    val name: String,
    val id: Int,
    val category: Category,
) {

    fun goodsInfo() {
        println("название товара: $name, id: $id, категория: ${category.getCategoryName()}")
    }
}

enum class Category {
    CLOTHES {
        override fun getCategoryName(): String {
            return "одежда"
        }
    },
    STATIONERY {
        override fun getCategoryName(): String {
            return "канцелярские товары"
        }
    },
    OTHER {
        override fun getCategoryName(): String {
            return "разное"
        }
    };

    abstract fun getCategoryName(): String
}

fun main() {
    val item1 = Goods("конструктор", 1223, Category.OTHER).goodsInfo()
    val item2 = Goods("ручка", 1223, Category.STATIONERY).goodsInfo()
    val item3 = Goods("худи", 1223, Category.CLOTHES).goodsInfo()
}
