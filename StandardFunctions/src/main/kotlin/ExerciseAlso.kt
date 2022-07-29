fun main(args: Array<String>) {
    Car2().apply {
        buildCar()
    }
        .also {
            println("Log: Building the car $it")
            println("Sending a message the police that car $it has been build")
        }
}

class Car2 {
    fun buildCar() = println("Building a car")
}