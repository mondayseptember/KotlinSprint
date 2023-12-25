package lesson_1_10.lesson_4

fun main() {
    var weight = 20
    var volume = 80

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${
            (weight > MIN_WEIGHT_FOR_AVERAGE && weight <= MAX_WEIGHT_FOR_AVERAGE) && (volume < MAX_VOLUME_FOR_AVERAGE)
        }"
    )

    weight = 50
    volume = 100
    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${
            (weight > MIN_WEIGHT_FOR_AVERAGE && weight <= MAX_WEIGHT_FOR_AVERAGE) && (volume < MAX_VOLUME_FOR_AVERAGE)
        }"
    )
}

const val MIN_WEIGHT_FOR_AVERAGE = 35
const val MAX_WEIGHT_FOR_AVERAGE = 100
const val MAX_VOLUME_FOR_AVERAGE = 100
