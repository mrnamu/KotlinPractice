package practice

fun main() {
    var lateInitSample = LateInitSample()
    println(lateInitSample.getLateInitText())

    lateInitSample.text = "super man"
    println(lateInitSample.getLateInitText())
}

class LateInitSample {
    lateinit var text:String

    fun getLateInitText():String {
        if (::text.isInitialized) {
            return text
        } else {
            return "default"
        }
    }
}