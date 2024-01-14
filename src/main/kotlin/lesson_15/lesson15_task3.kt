package lesson_15

abstract class ForumUser {
    abstract fun readMessage()
    abstract fun writeMessage()
}

class User : ForumUser() {
    override fun readMessage() {
        println("прочитать сообщение")
    }

    override fun writeMessage() {
        println("написать сообщение")
    }
}

class Admin : ForumUser() {
    override fun readMessage() {
        println("прочитать сообщение")
    }

    override fun writeMessage() {
        println("написать сообщение")
    }

    fun deleteMessage() {
        println("удалить сообщение")
    }

    fun deleteUser() {
        println("удалить пользователя")
    }
}

fun main() {
    println("На форуме обычные пользователи могут:")
    val user = User()
    user.readMessage()
    user.writeMessage()

    println()

    println("На форуме админы могут:")
    val admin = Admin()
    admin.readMessage()
    admin.writeMessage()
    admin.deleteMessage()
    admin.deleteUser()
}
