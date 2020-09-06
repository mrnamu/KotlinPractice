package chap02.section2

import com.example.edu.Person

fun main() {
    val number = 10
    var language = "Korean"
    val secondNumber: Int = 20
    language = "English"
    val ch = 65

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
    println("ch : ${ch.toChar()}")

    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}"
    println("str1: $str1, str2:$str2")
}