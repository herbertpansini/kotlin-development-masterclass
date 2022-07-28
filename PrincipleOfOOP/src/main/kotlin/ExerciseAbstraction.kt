fun main(args: Array<String>) {
    val myOven: DefaultOven = Bosch()
    val myRoadster = Roadster()

    myOven.cooking()
    myRoadster.cooking()
}

abstract class DefaultOven {
    val cookingSpeed = 120
    open val averageTemperature = 180

    abstract  fun cooking()
}

class Bosch: DefaultOven() {
    override val averageTemperature = 210

    override fun cooking() = println("Bosch oven cooking in $cookingSpeed minutes at $averageTemperature temperature")
}

class Roadster: DefaultOven() {
    override fun cooking() = println("A roadster roasts at $averageTemperature for $cookingSpeed minutes")
}