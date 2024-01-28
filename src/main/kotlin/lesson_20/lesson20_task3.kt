package lesson_20

class Player2(
    val keyPresence: Boolean
)

fun main() {
    val checkKeyPresence = { player: Player2 ->
        when (player.keyPresence) {
            true -> println("Дверь открыта")
            false -> println("Дверь заперта")
        }
    }

    checkKeyPresence(Player2(false))
    checkKeyPresence(Player2(true))
}
