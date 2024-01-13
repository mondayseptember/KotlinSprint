package lesson_14

open class CelestialObject(
    val name: String,
    val atmosphere: Boolean,
    val suitableForLanding: Boolean,
)

class Planet(
    name: String,
    atmosphere: Boolean,
    suitableForLanding: Boolean,
    var satellitesList: List<Satellite> = listOf(),
) : CelestialObject(name, atmosphere, suitableForLanding)

class Satellite(
    name: String,
    atmosphere: Boolean,
    suitableForLanding: Boolean,
) : CelestialObject(name, atmosphere, suitableForLanding)

fun main() {
    val earth = Planet("Mars", false, true)
    earth.satellitesList = listOf(
        Satellite("Phobos", false, false),
        Satellite("Deimos", false, false),
    )
    println("планетa: ${earth.name}")
    earth.satellitesList.forEach {
        println("спутник: ${it.name}")
    }
}
