package lesson_19

enum class Patron(val power: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {

    private var patronType: Patron? = null

    fun changePatronType(type: Patron) {
        patronType = type
    }

    fun shot() {
        println(patronType?.power ?: 0)
    }
}

fun main() {
    val tank = Tank()

    tank.changePatronType(Patron.BLUE)
    tank.shot()
    tank.shot()

    tank.changePatronType(Patron.GREEN)
    tank.shot()

    tank.changePatronType(Patron.RED)
    tank.shot()
}
