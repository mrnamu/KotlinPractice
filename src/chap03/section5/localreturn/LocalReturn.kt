package chap03.section5.localreturn

/* 비지역 반환(Non-local Return)
 * inline으로 out 메소드가 shortFunc에 삽입됨
 * inline을 사용하지 않으면 return 문을 사용할 수 없음.
 */
fun main() {
    shortFunc(3) {
        println("First call: $it")
        return
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}