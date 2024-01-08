package lesson_11

class Room(
    val cover: String,
    val name: String,
    val listOfParticipants: List<Member>,
)

class Member(
    val avatar: String,
    val userNickname: String,
    val speakerStatus: String
) {
    fun showNickname() {
        println(userNickname)
    }
}

fun main() {
    val room = Room(
        cover = "coverOfRoom.png",
        name = "Funny cats",
        listOfParticipants = listOf(
            Member("avatar1.png", "Tom", "разговаривает"),
            Member("avatar2.png", "Anna", "микрофон выключен"),
            Member("avatar3.png", "Sam", "пользователь заглушен")
        )
    )
}
