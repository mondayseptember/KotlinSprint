package lesson_16

class Circle(private val radius: Int) {
    private val pi = 3.14

    fun circumference(): Double {
        return 2 * pi * radius
    }

    fun area(): Double {
        return pi * radius * radius
    }
}

fun main() {
    val circle = Circle(10)
    println(circle.circumference())
    println(circle.area())
}
