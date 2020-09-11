package chap04.section3.noinline


fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")

    // 익명함수
//    inlineLambda(13, 3, fun (a, b):String {
//        if (a + b > 10) {
//            return "Error"
//        }
//        return "Succes"
//    })

    // 라벨 사용법
    inlineLambda(13, 3) lit@{ a, b ->
        val result = a + b
        if(result > 10) return@lit
        println("result: $result")
    }

    // 이렇게도 사용한다.
//    inlineLambda(13, 3) { a, b ->
//        val result = a + b
//        if(result > 10) return@inlineLambda
//        println("result: $result")
//    }

    println("end of retFunc")
}