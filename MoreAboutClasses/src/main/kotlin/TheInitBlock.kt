fun main(args: Array<String>) {
    val car = Car3()
}

/**
 * The "Init" block is run before any other code in the class
 * The "Init" block provides functionality in addition to the primary constructor
 */
class Car3 {
    val model = "No model"
    val topSpeed = 100

    init {
        println("This car is a $model and has a top speed of $topSpeed")
    }
}
