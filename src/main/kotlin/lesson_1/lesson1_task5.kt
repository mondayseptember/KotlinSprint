package lesson_1

fun main() {
    var sec = 6480
    val hours = sec / 3600
    val min = (sec - hours * 3600) / 60
    sec = sec - hours * 3600 - min * 60

    val hh = if (hours < 10) {
        "0" + "$hours"
    } else "$hours"

    val mm = if (min < 10) {
        "0" + "$min"
    } else "$min"

    val ss = if (sec < 10) {
        "0" + "$sec"
    } else "$sec"

    println("$hh:$mm:$ss")
}