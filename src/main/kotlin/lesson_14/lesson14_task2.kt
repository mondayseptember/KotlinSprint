package lesson_14

open class Liner2(
    val speed: Int = 40,
    val carryingCapacity: Int = 200000,
    val numberOfPassengers: Int = 3000,
) {

    open fun shipping() {
        println("лайнер выдвигает горизонтальный трап со шкафута")
    }

    fun infoAboutShip() {
        println(
            "скорость: $speed, " +
                "грузоподъемность: $carryingCapacity, " +
                "максимальное количество пассажиров: $numberOfPassengers"
        )
    }
}

class CargoShip2(
    speed: Int = 30,
    carryingCapacity: Int = 300000,
    numberOfPassengers: Int = 500,
) : Liner2(speed, carryingCapacity, numberOfPassengers) {

    override fun shipping() {
        println("грузовой корабль активирует погрузочный кран")
    }
}

class Icebreaker2(
    speed: Int = 20,
    carryingCapacity: Int = 120000,
    numberOfPassengers: Int = 100,
) : Liner2(speed, carryingCapacity, numberOfPassengers) {

    fun crushIce() {
        println("запущен режим колки льда")
    }

    override fun shipping() {
        println("ледокол открывает ворота со стороны кормы")
    }
}

fun main() {
    val liner = Liner2()
    liner.infoAboutShip()

    val cargoShip = CargoShip2()
    cargoShip.infoAboutShip()

    val icebreaker = Icebreaker2()
    icebreaker.infoAboutShip()
}
