package lesson_18

abstract class Tamagotchi {

    abstract fun play(): String

    abstract fun sleep(): String

    abstract fun eat(): String
}

class Fox(
    val name: String,
    private val food: String = "ягоды",
) : Tamagotchi() {
    override fun play(): String {
        return "$name - играет"
    }

    override fun sleep(): String {
        return "$name - спит"
    }

    override fun eat(): String {
        return "$name - ест $food"
    }
}

class Dog(
    val name: String,
    private val food: String = "кости",
) : Tamagotchi() {
    override fun play(): String {
        return "$name - играет"
    }

    override fun sleep(): String {
        return "$name - спит"
    }

    override fun eat(): String {
        return "$name - ест $food"
    }
}

class Cat(
    val name: String,
    private val food: String = "рыбу",
) : Tamagotchi() {
    override fun play(): String {
        return "$name - играет"
    }

    override fun sleep(): String {
        return "$name - спит"
    }

    override fun eat(): String {
        return "$name - ест $food"
    }
}

fun main() {
    val tamagotchi1 = Fox("Лиса")
    val tamagotchi2 = Dog("Собака")
    val tamagotchi3 = Cat("Кошка")

    val arrayOfAnimals = arrayOf<Tamagotchi>(tamagotchi1, tamagotchi2, tamagotchi3)

    arrayOfAnimals.forEach {
        println("${it.play()}, ${it.sleep()}, ${it.eat()}")
    }
}
