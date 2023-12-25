package lesson_1_10.lesson_5

fun main() {
    println("Введите, пожалуйста, свое имя:")
    val userName = readln()
    val login = "Zaphod"
    val password = "PanGalactic"

    if (userName == login) {
        println("Введите пароль, $userName:")
        val userPassword = readln()
        if (userPassword == password) {
            println("Добро пожаловать!")
        } else {
            println("Неверный пароль")
        }
    } else {
        println("Необходимо зарегистрироваться")
    }
}
