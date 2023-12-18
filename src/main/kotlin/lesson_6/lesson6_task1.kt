package lesson_6

fun main() {
    println("Создайте логин:")
    val login = readln()
    println("Создайте пароль:")
    val password = readln()

    do {
        println("Введите логин:")
        val userLogin = readln()
        println("Введите пароль:")
        val userPassword = readln()
    } while (((userLogin != login) && (userPassword != password)) ||
        ((userLogin == login) && (userPassword != password)) ||
        ((userLogin != login) && (userPassword == password))
    )
    println("Авторизация прошла успешно")
}
