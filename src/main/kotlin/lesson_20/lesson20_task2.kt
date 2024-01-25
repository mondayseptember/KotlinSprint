package lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 10,
)

fun main() {
    val healingPotion = { player: Player ->
        player.currentHealth = player.maxHealth
    }

    val player1 = Player("Pin", 6)
    healingPotion(player1)

    println(player1.currentHealth)
}
