package lesson_16

class User(
    private val login: String,
    private val password: String,
) {

    fun validationPassword(userPassword: String): Boolean {
        return userPassword == password
    }
}

fun main() {
    val user = User("Lilo", "Stitch")
    println(user.validationPassword("Stitch"))
    println(user.validationPassword("test"))
}
