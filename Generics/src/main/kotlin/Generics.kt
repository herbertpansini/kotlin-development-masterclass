/**
 * A class can have type parameters
 * The type can be used by variables and methods
 * Useful when a class can handle multiple types of parameters
 * We can have multiple generics, separated by commas
 */
fun main(args: Array<String>) {
    val myBox = Box<String>()
    myBox.display("Contents")

    val carBox = Box<Car>()
    carBox.display(Car())

    val newBox = NewBox<Int, Float>()
    newBox.display(34, 57.4F)
}

class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

class NewBox<T, U> {
    fun display(item: T, item2: U) {
        println(item)
        println(item2)
    }
}

class Car