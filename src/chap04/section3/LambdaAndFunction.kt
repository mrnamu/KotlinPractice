package chap04.section3


fun greet() = fun() {
    println("Hello, Kotlin!")
}

fun greet2() = {
    println("Hello, Kotlin2!")
}

val greet3 = fun() {
    println("Hello, Kotlin3!")
}

val greet4 = {
    println("Hello, Kotlin4!")
}

fun main() {
    greet()()
    greet2()()
    greet3()
    greet4()
}