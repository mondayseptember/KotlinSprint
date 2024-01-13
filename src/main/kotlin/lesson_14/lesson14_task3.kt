package lesson_14

const val PI = 3.14

abstract class Figure(
    val color: String,
) {

    abstract fun area(): Double

    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun area(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {

    override fun perimeter(): Double {
        return PI * (width + height)
    }

    override fun area(): Double {
        return width * height
    }
}


fun main() {
    val circle1 = Circle("white", 5.0)
    val circle2 = Circle("black", 20.0)
    val rectangle1 = Rectangle("white", 3.0, 4.0)
    val rectangle2 = Rectangle("black", 5.0, 5.0)

    val listOfFigure = listOf(circle1, circle2, rectangle1, rectangle2)

    var sumOfPerimeters: Double = 0.0
    var sumOfAreas: Double = 0.0

    listOfFigure.forEach {
        when (it.color) {
            "black" -> sumOfPerimeters += it.perimeter()
            "white" -> sumOfAreas += it.area()
        }
    }
    println("сумма периметров всех черных фигур: $sumOfPerimeters")
    println("сумма площадей всех белых фигур: $sumOfAreas")
}
