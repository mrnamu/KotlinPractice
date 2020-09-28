package chap07.section1.coffeeMaker

class MyDripCoffeeModule:CoffeeModule {
    companion object {
        val electricHeader:ElectricHeader by lazy {
            ElectricHeader()
        }
    }

    private val _thermosiphon:Thermosiphon by lazy {
        Thermosiphon(electricHeader)
    }

    override fun getThermosiphon(): Thermosiphon = _thermosiphon

}