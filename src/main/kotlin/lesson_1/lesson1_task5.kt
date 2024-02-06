package lesson_1

fun main() {
    val spaceTimeInSec = 6480
    val secondsToHours = 3600
    val secondsToMinutes = 60

    val hoursInSpace = spaceTimeInSec / secondsToHours
    val minInSpace = (spaceTimeInSec - hoursInSpace * secondsToHours) / secondsToMinutes
    val secInSpace = spaceTimeInSec % secondsToMinutes

    println(String.format("%02d:%02d:%02d", hoursInSpace, minInSpace, secInSpace))
}
