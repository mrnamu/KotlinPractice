package chap02.section3

fun main() {
    val x: Any
    x = "Hello"

    if (x is String) {
        print(x.length)
    }

    val y: Int? = 10
    val a: String? = y as? String
    println("a = $a")
}