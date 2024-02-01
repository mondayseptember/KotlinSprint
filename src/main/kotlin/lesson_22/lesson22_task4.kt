package lesson_22

data class MainScreenState(
    val data: String,
    var isLoading: Boolean = false,
) {

    fun loadData(): MainScreenState {
        return copy(isLoading = true)
    }
}

fun main() {
    val state = MainScreenState("test").loadData()
    println(state)
}
