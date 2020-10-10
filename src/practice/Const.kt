package practice

fun main() {

    val foodCourt = FoodCourt()
    println(foodCourt.searchPrice("크림파스타"))
}

class FoodCourt {
    fun searchPrice(foodName:String):Int {

        val price = when(foodName) {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 8500
            else -> 0
        }

        return price
    }

    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}