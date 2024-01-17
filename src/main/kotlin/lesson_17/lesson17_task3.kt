package lesson_17

class Folder(name: String, numberOfFiles: Int, var isSecret: Boolean) {

    val name = name
        get() = if (isSecret) "Скрытая папка" else field

    var numberOfFiles = numberOfFiles
        get() = if (isSecret) 0 else field
}

fun main() {
    val folder = Folder("folder", 6, true)
    println(folder.name)
    println(folder.numberOfFiles)
}
