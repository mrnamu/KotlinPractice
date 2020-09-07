package chap03.section5.noinline

import chap03.section5.shortFunc

fun main() {
    shortFunc(3) { println("First call: $it") }
}

/* 특정 람다식을 inline 처리하지 않으려면 noinline을 사용한다. */
inline fun shortFunc(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}