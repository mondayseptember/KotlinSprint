package lesson_11

class RecipeCategory(
    val title: String,
    val categoryName: String,
    val descriptionAboutCategory: String,
    val icon: String,
    val recipesOfSelectedCategory: String,
) {

    fun openCategory() {
        println("Перейти в раздел Категории")
    }

    fun chooseRecipeCategory() {
        println("Выбор категории рецептов")
    }
}

class Recipe(
    val icon: String,
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

fun main() {
    val recipeCategory = RecipeCategory(
        "Категории",
        "Бургеры",
        "Рецепты всех популярных видов бургеров",
        "iconOfRecipeCategory.png",
        "Классический гамбургер",
    )

    val ingredients = Ingredient("творог", 350, 1)

    val recipe = Recipe(
        "iconOfRecipe.png",
        "Бургер с грибами и сыром",
        listOf(ingredients),
        true,
        "Cпособ приготовления",
    )
}
