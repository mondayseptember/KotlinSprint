package lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println("Виды рыб, которые можно добавить в аквариум: ")
    for (i in Fish.entries) println(i)
}
