package lesson_21

import java.io.File

fun main() {
    val file = File("textFile.txt")
    file.createNewFile()
    file.addWordToFile("One")
    file.addWordToFile("Two")
    println(file.readLines())
}

fun File.addWordToFile(word: String) {
    appendText(word.lowercase())
    appendText("\n")
}
