package lesson_21

fun main() {
    val word = String()
    println(word.vowelCount("hello"))
}

fun String.vowelCount(word: String): Int {
    var numberOfVowels = 0
    val vowels = "aeiou"

    for (i in word.lowercase()) {
        if (i in vowels) {
            numberOfVowels += 1
        }
    }
    return numberOfVowels
}
