package lesson_20

fun main() {
    println("Введите имя:")
    val username = readln()

    val greetingUser = { username: String ->
        println("С наступающим Новым Годом, $username!")
    }
    greetingUser(username)
}
