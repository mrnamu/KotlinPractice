package chap03.section5

fun main() {
    val multi = 3 multiply 10
    println("multi: $multi")
}

/**
 * 중위 함수
 * 중위 표현법(Infix Notation)이란 클래스의 멤버를 호출할 때 사용하는 점을 생략하고
 * 함수 이름 뒤에 소괄호를 붙이지 않아 직관적인 이름을 사용할 수 있는 표현법.
 *
 * 중위 함수의 조건
 * 1. 멤버 메서드 또는 확장함수여야 한다.
 * 2. 하나의 매개변수를 가져야 한다.
 * 3. infix 키워드를 사용하여 정의한다.
 */
infix fun Int.multiply(x: Int): Int {
    return this * x
}