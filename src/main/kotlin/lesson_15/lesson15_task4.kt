package lesson_15

interface Goods {
    val name: String
    val quantityInStock: Int
}

class Instrument(
    override val name: String,
    override val quantityInStock: Int
) : Goods {
    fun searchForComponent() {
        println("Выполняется поиск")
    }
}

class Component(
    override val name: String,
    override val quantityInStock: Int
) : Goods
