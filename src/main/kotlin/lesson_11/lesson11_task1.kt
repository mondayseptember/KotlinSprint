package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User(
        id = 1,
        login = "User1",
        password = "password1",
        email = "test@gmail.com",
    )

    val user2 = User(
        id = 2,
        login = "User2",
        password = "password2",
        email = "test2@gmail.com",
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}
