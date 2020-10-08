package practice

class FoodManager(private var name:String) {

    private var count = 0;

    // static member와 동일
    companion object {
        var totalCount = 0
    }

    fun countUp() {
        count++
        totalCount++
    }

    fun show() {
        println("${name}의 갯수는 ${count}개 입니다.")
    }
}


// object 생성 - singleton 패턴의 언어적 지원
object SubFoodManager {
    var totalCount = 0
    fun countUp() {
        totalCount++
    }

    fun clear() {
        totalCount = 0
    }
}

fun main() {
    var apple = FoodManager("사과")
    var lemon = FoodManager("레몬")

    apple.countUp()
    apple.countUp()

    lemon.countUp()
    lemon.countUp()
    lemon.countUp()

    apple.show()
    lemon.show()
    println("전체 갯수는 ${FoodManager.totalCount}개 입니다.")
}