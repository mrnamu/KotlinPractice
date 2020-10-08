package practice


fun main() {
    UsingGeneric(A()).doRunning()
    UsingGeneric(B()).doRunning()
    UsingGeneric(C()).doRunning()

    doRunning(B())
}

fun <T:A> doRunning(t:T) {
    t.run()
}

open class A {
    open fun run() {
        println("A가 달립니다.")
    }
}

class B : A() {
    override fun run() {
        println("B가 달립니다.")
    }
}

class C : A() {
    override fun run() {
        println("C가 달립니다.")
    }
}

class UsingGeneric<T:A> (val t:T) {
    fun doRunning() {
        t.run()
    }
}