package lesson_17

class Quiz(question: String, answer: String) {

    val question = question
        get() = field
    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quiz = Quiz("Which ocean is the deepest on Earth?", "The Pacific Ocean")
    println(quiz.question)
    println(quiz.answer)
    quiz.answer = "new answer"
    println(quiz.answer)
}
