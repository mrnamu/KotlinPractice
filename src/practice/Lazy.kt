package practice

fun main() {
    val a:Int by lazy {
        println("초기화합니다.")
        10
    }

    println(a)
    println(a)
}