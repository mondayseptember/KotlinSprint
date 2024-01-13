package lesson_14

open class Liner(
    val speed: Int = 40,
    val carryingCapacity: Int = 200000,
    val numberOfPassengers: Int = 3000,
)

class CargoShip(
    speed: Int = 30,
    carryingCapacity: Int = 300000,
    numberOfPassengers: Int = 500,
) : Liner(speed, carryingCapacity, numberOfPassengers)

class Icebreaker(
    speed: Int = 20,
    carryingCapacity: Int = 120000,
    numberOfPassengers: Int = 100,
) : Liner(speed, carryingCapacity, numberOfPassengers) {

    fun crushIce() {
        println("запущен режим колки льда")
    }
}

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()
}
