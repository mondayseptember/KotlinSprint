package lesson_16

private const val PI = 3.14

class Circle(private val radius: Int) {
    fun circumference(): Double {
        return 2 * PI * radius
    }

    fun area(): Double {
        return PI * radius * radius
    }
}

fun main() {
    val circle = Circle(10)
    println(circle.circumference())
    println(circle.area())
}
