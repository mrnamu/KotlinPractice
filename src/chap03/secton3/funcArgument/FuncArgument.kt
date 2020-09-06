package chap03.secton3.funcArgument

fun main() {
    val res1 = chap03.secton3.funcfunc.sum(3, 2)
    val res2 = mul(chap03.secton3.funcfunc.sum(3, 3), 3)

    println("res1: $res1, res2:$res2")
}

fun sum(a:Int, b:Int) = a + b
fun mul(a:Int, b:Int) = a * b