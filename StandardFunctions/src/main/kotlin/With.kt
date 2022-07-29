/**
 * Perform a block of code on an object
 * The context is available as "this" (the "this" keyword can be omitted)
 * Can access object variables and methods
 * Typical use case
 *  - perform some initialization on an object
 *  - perform a sequence of actions on an object
 */
fun main(args: Array<String>) {
    with(Car()) {
        speed = 80
        drive()
        println("Car is driving")
    }
}

class Car {
    var speed = 50

    fun drive() = println("Driving at $speed")
}