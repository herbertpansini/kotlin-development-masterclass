/**
 * Can be used to apply some functionality and return a result
 * Returns the initial object
 * Common use case is applying configuration to an object creation
 */
fun main(args: Array<String>) {
    val myCar = MyCar().apply {
        speed = 50
        color = "Red"
        startCar()
    }
    println(myCar)
}

class MyCar {
    var speed = 10
    var color = "Blue"
    fun startCar() = println("Starting the car, speed is $speed, color is $color")
}