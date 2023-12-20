package lesson_8

fun main() {
    val numberOfViewsPerDay = arrayOf(111, 113, 110, 222, 98, 342, 301)
    var numberOfViewsPerWeek = 0

    for (i in numberOfViewsPerDay) {
        numberOfViewsPerWeek += i
    }
    println(numberOfViewsPerWeek)
}
