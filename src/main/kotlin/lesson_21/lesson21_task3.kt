package lesson_21

class Player3(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 10,
)

fun main() {
    val player1 = Player3("Max", 1).isHealthy()
    println(player1)
}

fun Player3.isHealthy(): Boolean {
    return currentHealth == maxHealth
}
