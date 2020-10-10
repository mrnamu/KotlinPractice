package practice

fun main() {
    var map = mutableMapOf("레드벨벳" to "음파음파",
                            "트와이스" to "FANCY",
                            "ITZY" to "ICY")

    for (entry in map) {
        println("${entry.key} : ${entry.value}")
    }

    map.put("오마이걸", "번지")
    println(map)

    map.remove("ITZY")
    println(map)
    
    println(map["레드벨벳"])
}