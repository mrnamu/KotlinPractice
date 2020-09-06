package chap03.secton3

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByValue function")
    return b()
}

val otherLambda:() -> Boolean = {
    println("lambda function")
    true
}