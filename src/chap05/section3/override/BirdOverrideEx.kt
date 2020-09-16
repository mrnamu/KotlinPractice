package chap05.section3.override

open class Bird(var name:String, var wing:Int, var beak:String, var color:String) {
    fun fly() = println("Fly!")
    open fun sing(vol:Int) = println("Sing! $vol")
}

class Parrot(name:String, wing:Int, beak:String, color:String, var language:String = "natural") : Bird(name, wing, beak, color) {
    fun speak() = println("$language")
    override fun sing(vol:Int) {
        println("I'm a parrot. The volume level is $vol")
        speak()
    }
}

fun main() {
    val parrot = Parrot(name = "myParrot", wing = 3, beak = "short", color = "multiple")
    parrot.language = "English"

    println("${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5)
}