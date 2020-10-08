package practice


class Animal(var type:String) {
    fun eat() {
        println("${type}가 냠냠")
    }
}


fun main() {

    var type = "Show"

    val animal = Animal("고양이").apply {
        type = "개"
        eat()
    }

    val newType = animal.run {
        type = "고래"
        type
    }

    val withType = with(animal) {
        type = "상어"
        type
    }

    animal.let {
        it.type = "Dog"
    }

    println(animal.type)
    println(newType)
    println(withType)
}