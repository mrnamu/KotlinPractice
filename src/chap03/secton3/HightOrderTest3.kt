package chap03.secton3

fun main() {
    val out:() -> Unit = {println("Hello World!")}

    out()
    val new = out
    new()
}