package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printInfoAboutUser() {
        println("id: $id, login: $login, password: $password, email: $email, bio: $bio")
    }

    fun addInfoToBio() {
        println("Напишите о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Для смены пароля введите текущий пароль:")

        when (readln()) {
            password -> {
                println("Введите новый пароль:")
                password = readln()
                println("Ваш пароль был изменен")
            }

            else -> println("Неверный пароль")
        }
    }
}

fun main() {
    val user = User2(
        id = 1,
        login = "User1",
        password = "password1",
        email = "test@gmail.com",
    )
    user.addInfoToBio()
    user.changePassword()
    user.printInfoAboutUser()
}
