package lesson_18

open class Box {

    open fun calculationAreaOfSurface() = 0

    class RectangularBox(
        val sideOfBox: Rectangular,
    ) : Box() {
        override fun calculationAreaOfSurface(): Int {
            return 2 * (
                sideOfBox.length * sideOfBox.width +
                    sideOfBox.width * sideOfBox.height + sideOfBox.length * sideOfBox.height
                )
        }
    }

    class СubeBox(
        val sideOfBox: Int,
    ) : Box() {
        override fun calculationAreaOfSurface(): Int {
            return 6 * sideOfBox * sideOfBox
        }
    }
}

class Rectangular(
    val length: Int,
    val width: Int,
    val height: Int,
)

fun main() {
    val rectangularParcel: Box = Box.RectangularBox(Rectangular(1, 2, 3))
    println(rectangularParcel.calculationAreaOfSurface())

    val cubeParcel: Box = Box.СubeBox(3)
    println(cubeParcel.calculationAreaOfSurface())
}
