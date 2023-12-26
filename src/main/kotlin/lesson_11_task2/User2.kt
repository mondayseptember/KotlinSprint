package lesson_11_task2

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
