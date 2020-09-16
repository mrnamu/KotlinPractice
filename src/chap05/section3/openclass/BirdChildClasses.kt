package chap05.section3.openclass

open class Bird(var name:String, var wing:Int, var beak:String, var color:String) {
    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol: $vol")
}

// 주 생성자를 사용한 상속
class Lark(name:String, wing:Int, beak:String, color:String) :Bird(name, wing, beak, color) {
    fun singHitone() = println("Happy song!")
}


// 부 생성자를 사용한 상속
class Parrot : Bird {
    val language: String

    constructor(name:String, wing:Int, beak:String, color:String, language:String) : super(name, wing, beak, color) {
        this.language = language
    }

    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")
    val lark = Lark("mylark", 2, "long", "brown")
    val parrot = Parrot("myparrot", 2, "short", "multiple", "korean")

    println("${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    coco.fly()
    lark.singHitone()
    parrot.speak()
}