package chap05.section5.internal


fun main() {
    val otheric = InternalClass()
    println(otheric.i)
    otheric.icFunc()
}

open class Base {
    open val a = 1
}

class First : Base() {
    override val a = 2
}