package lesson_11

class Room(
    val cover: String,
    val name: String,
    val listOfParticipants: List<String>,
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
        listOfParticipants = listOf("avatar1", "avatar2", "avatar3"),
        userNickname = "User1",
        speakerStatus = "микрофон выключен"
    )
}
