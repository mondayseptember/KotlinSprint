package lesson_17

class Ship(
    name: String,
    val averageSpeed: Int,
    val port: String,
) {

    var name = name
        set(value) {
            println("Имя корабля менять нельзя")
        }
}

fun main() {
    val ship = Ship("The Black Pearl", 44, "Tortuga")
    println(ship.name)
    ship.name = "The Flying Dutchman"
    println(ship.name)
}
