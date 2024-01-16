package lesson_16

class Order(
    private val orderNumber: Int,
    private var status: String,
) {
    fun getStatus() = status

    fun changeOrderStatus(newStatus: String) {
        status = newStatus
    }
}

fun main() {
    val order = Order(1234, "ready to ship")
    println(order.getStatus())
    order.changeOrderStatus("send")
    println(order.getStatus())
}
