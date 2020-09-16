package chap05.section6.composition


// Composition 구성 관계
class Car(val name:String,  val power:String) {
    private var engine = Engine(power)

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power:String) {
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped.")
}

fun main() {
    var car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}