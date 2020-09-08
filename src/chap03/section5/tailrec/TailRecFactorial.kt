package chap03.section5.tailrec

fun main() {
    val number = 4
    println("Factorial: $number -> ${factorial(number)}")
}

/* 꼬리재귀 - 호출 함수로 돌아갔을 때 실행할 작업이 없는 함수, 반복문으로 변경된다. */
tailrec fun factorial(n: Int, run: Int = 1): Long {
    println("n = $n, run = $run")
    return if (n == 1) run.toLong() else factorial(n - 1, run * n)
}