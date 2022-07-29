/**
 * Used for performing some additional actions on an object
 * Common use case is adding some actions that don't affect the object
 *  such as logging or debugging information
 * Removing an also block should not affect the execution of a program
 */
fun main(args: Array<String>) {
    Car().apply {
        speed = 80
        drive()
    }
    .also { car ->
        println("Car is running")
        println("Car speed is ${car.speed}")
    }
}