package practice

fun main() {

    var general = General("홍길동", 14)

    println(general == General("홍길동", 14))
    println(general.hashCode())
    println(general)

    var data = Data("임꺽정", 23)
    println(data == Data("임꺽정", 23))
    println(data.hashCode())
    println(data)
    println(data.copy(age = 11))
    println(data.copy(name = "Mr.Lee"))


    var list = listOf(Data("신사임당", 33), Data("세종대왕", 45), Data("이순신", 21))
    for((a, b) in list) {
        println("name:${a}, age:${b}")
    }
}


class General (var name:String, var age:Int)
data class Data(var name:String, var age:Int)