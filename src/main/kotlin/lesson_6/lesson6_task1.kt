package lesson_6

fun main() {
    println("Создайте логин:")
    val login = readln()
    println("Создайте пароль:")
    val password = readln()

    println("Введите логин")
    var userLogin = readln()
    println("Введите пароль")
    var userPassword = readln()

    while ((userLogin != login && userPassword != password) ||
        (userLogin == login && userPassword != password) ||
        (userLogin != login && userPassword == password)
    ) {
        println("Введите логин")
        userLogin = readln()

        println("Введите пароль")
        userPassword = readln()
    }
    println("Авторизация прошла успешно")
}
