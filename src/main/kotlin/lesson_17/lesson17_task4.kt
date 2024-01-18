package lesson_17

class Parcel(
    val parcelNumber: Int,
    currentLocation: String,
) {

    var currentLocation = currentLocation
        set(value) {
            field = value
            movementCounter += 1
        }

    var movementCounter = 0
}

fun main() {
    val parcel = Parcel(1123, "Tokio")
    println(parcel.movementCounter)
    parcel.currentLocation = "Fuchu"
    println(parcel.movementCounter)
}
