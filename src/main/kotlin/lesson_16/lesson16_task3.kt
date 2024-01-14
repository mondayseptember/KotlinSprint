package lesson_16

class User {

    private val login = "login"
    private val password = "password"

    fun validationPassword(userPassword: String) {
        when (userPassword) {
            password -> println("true")
            else -> println("false")
        }
    }
}

fun main() {
    User().validationPassword("password")
    User().validationPassword("password1")
}
