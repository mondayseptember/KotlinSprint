package lesson_15

interface FlyingCreatures {
    fun fly()
}

interface SwimmingCreatures {
    fun swim()
}

class Crucian : SwimmingCreatures {
    override fun swim() {
        println("Плывут под водой, волнообразно изгибая тело")
    }
}

class Seagull : FlyingCreatures {
    override fun fly() {
        println("Летают, делая частые взмахи крыльями")
    }
}

class Duck : SwimmingCreatures, FlyingCreatures {
    override fun swim() {
        println("При передвижении по воде перебирают ногами попеременно")
    }

    override fun fly() {
        println("При передвижении по воздуху летают, делая частые взмахи крыльями")
    }
}

fun main() {
    val crucian = Crucian()
    crucian.swim()

    val seagull = Seagull()
    seagull.fly()

    val duck = Duck()
    duck.swim()
    duck.fly()
}
