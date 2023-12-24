package lesson_10

fun main() {
    val login = getLogin()
    val password = getPassword()
    loginAndPasswordValidation(login, password)
}

fun getLogin(): String {
    println("Придумайте логин:")
    return readln()
}

fun getPassword(): String {
    println("Придумайте пароль:")
    return readln()
}

fun loginAndPasswordValidation(login: String, password: String) {
    if ((login.length < 4) || (password.length < 4)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }
}
