package chap04.section1

fun main() {
    print("Enter the score:")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..100.0 -> grade = 'B'
        in 70.0..100.0 -> grade = 'C'
        in 60.0..100.0 -> grade = 'D'
        !in 60.0..100.0 -> grade = 'F'
    }

    println(grade)
}