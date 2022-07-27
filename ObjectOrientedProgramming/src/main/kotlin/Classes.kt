/**
 * A class is a blueprint for components (objects)
 * A class has
 *  Variables
 *  Methods (functions)
 * Naming convention
 *  Name should start with a capital letter
 */
class Car {
   var model: String? = null
   var topSpeed = 100

   fun start() {
       println("Starting the $model")
   }

    fun drive(speed: Int) {
        println("Driving at a speed of $speed")
    }
}

fun main(args: Array<String>) {
    val myCar = Car()
    val yourCar = Car()

    myCar.model = "BMW"
    yourCar.model = "Toyota"

    myCar.start()
    myCar.drive(50)

    yourCar.start()
    yourCar.drive(75)
}