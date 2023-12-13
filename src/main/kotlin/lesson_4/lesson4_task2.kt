package lesson_4

fun main() {
    val minWeightForAverage = 35
    val maxWeightForAverage = 100
    val maxVolumeForAverage = 100

    var weight = 20
    var volume = 80

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight > minWeightForAverage && weight <= maxWeightForAverage) && (volume < maxVolumeForAverage)}")

    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight > minWeightForAverage && weight <= maxWeightForAverage) && (volume < maxVolumeForAverage)}")
}