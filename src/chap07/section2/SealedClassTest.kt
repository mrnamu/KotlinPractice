package chap07.section2

// sealed '봉인된'이라는 의미로, 미리 만들어 놓은 자료형들을 묶어서 제공한다.
// 실드 클래스를 선언하는 첫번째 방법
sealed class Result {
    open class Success(val message:String): Result()
    class Error(val code:Int, val message:String): Result()
}

class Status: Result()
class Inside: Result.Success("Status")

fun main() {
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(msg)
}

fun eval(result:Result):String = when(result) {
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
}