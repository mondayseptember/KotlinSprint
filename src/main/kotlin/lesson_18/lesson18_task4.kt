package lesson_18

abstract class Box {

    abstract fun calculationAreaOfSurface(): Int
    abstract val length: Int
}

class RectangularBox(
    override val length: Int,
    val width: Int,
    val height: Int,
) : Box() {
    override fun calculationAreaOfSurface(): Int {
        return 2 * (length * width + width * height + length * height)
    }
}

class CubeBox(
    override val length: Int,
) : Box() {
    override fun calculationAreaOfSurface(): Int {
        return 6 * length * length
    }
}

fun main() {
    val rectangularParcel: Box = RectangularBox(1, 2, 3)
    println(rectangularParcel.calculationAreaOfSurface())

    val cubeParcel: Box = CubeBox(3)
    println(cubeParcel.calculationAreaOfSurface())
}
