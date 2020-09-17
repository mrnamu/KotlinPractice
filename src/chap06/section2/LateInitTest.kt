package chap06.section2

class Person {
    lateinit var name: String

    fun test() {
        if (!::name.isInitialized) {
            println("not initialized.")
        } else {
            println("initialized.")
        }
    }
}

fun main() {
    val gilDong = Person()
    gilDong.test()
    gilDong.name = "GilDong"
    gilDong.test()
    println("name = ${gilDong.name}")
}