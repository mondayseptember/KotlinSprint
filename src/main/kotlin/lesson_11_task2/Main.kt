package lesson_11_task2

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
