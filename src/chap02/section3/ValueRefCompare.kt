package chap02.section3

fun main() {
    val a = 127
    val b = 127
    println(a === b)

    val c: Int? = 127
    val d: Int? = a
    val e: Int? = c
    println(c == d)
    println(c === b)
    println(c === e)
}