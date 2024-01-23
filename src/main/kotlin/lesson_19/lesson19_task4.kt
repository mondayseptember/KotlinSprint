package lesson_19

enum class Patron(val power: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {

    fun choosePatronType(patron: Patron): Patron {
        return patron
    }

    fun shot(patronType: Patron) {
        println(patronType.power)
    }
}

fun main() {
    val tank = Tank()
    tank.shot(tank.choosePatronType(Patron.BLUE))
    tank.shot(tank.choosePatronType(Patron.GREEN))
    tank.shot(tank.choosePatronType(Patron.RED))
}
