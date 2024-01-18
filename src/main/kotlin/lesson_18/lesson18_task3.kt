package lesson_18

open class Tamagotchi {

    open fun play() = ""

    open fun sleep() = ""

    open fun eat() = ""

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
}

fun main() {
    val fox = Tamagotchi.Fox("Лиса")
    val dog = Tamagotchi.Dog("Собака")
    val cat = Tamagotchi.Cat("Кошка")

    val arrayOfAnimals = arrayOf<Tamagotchi>(fox, dog, cat)

    arrayOfAnimals.forEach {
        println("${it.play()}, ${it.sleep()}, ${it.eat()}")
    }
}
