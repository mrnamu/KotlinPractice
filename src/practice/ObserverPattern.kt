package practice

interface EventListener {
    fun onEvent(count:Int)
}

class Counter(private val eventListener: EventListener) {
    fun count() {
        for (i in 0..100) {
            eventListener.onEvent(i)
        }
    }
}

class EventPrinter {
    fun start() {
        val counter = Counter(object:EventListener {
            override fun onEvent(count: Int) {
                println("${count}")
            }

        })
        counter.count()
    }
}

fun main() {
    EventPrinter().start()
}