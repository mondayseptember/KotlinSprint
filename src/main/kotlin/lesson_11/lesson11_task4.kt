package lesson_11

class RecipeCategory(
    val title: String,
    val categoryName: String,
    val descriptionAboutCategory: String,
    val icon: String,
) {

    fun openCategory() {
        println("Перейти в раздел Категории")
    }

    fun chooseRecipeCategory() {
        println("Выбор категории рецептов")
    }
}

class Recipe(
    val name: String,
    val ingredients: List<Ingredient>,
    var inFavorites: Boolean = false,
    val stepsOfCooking: String,
) {
    fun addToFavorites() {
        inFavorites = true
    }

    fun removeFromFavorites() {
        inFavorites = false
    }
}

class Ingredient(
    val name: String,
    val quantity: Int,
    val numberOfPortion: Int,
) {
    fun changeNumberOfPortion() {
        quantity * numberOfPortion
    }
}
