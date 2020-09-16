package chap03.section5


fun main() {
    chap03.section5.localreturn.shortFunc(3) { println("First call: $it") }
    chap03.section5.localreturn.shortFunc(5) { println("Second call: $it") }
}

/* inline을 사용하면 inline 함수의 내용이 호출 위치에 복사된다. */
inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}