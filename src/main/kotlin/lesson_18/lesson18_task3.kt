package lesson_18

abstract class Tamagotchi {

    abstract val food: String
    abstract val name: String

    abstract fun play(): String

    abstract fun sleep(): String

    abstract fun eat(): String
}

class Fox(
    override val name: String,
) : Tamagotchi() {

    override val food: String = "ягоды"
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
    override val name: String,
) : Tamagotchi() {

    override val food: String = "кости"
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
    override val name: String,
) : Tamagotchi() {

    override val food: String = "рыбу"
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
