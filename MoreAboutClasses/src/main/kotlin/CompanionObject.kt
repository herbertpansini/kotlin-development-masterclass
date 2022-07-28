fun main(args: Array<String>) {
    println(Car4.provideDrivingInstructions())
}

/**
 * Static code
 * Make class code available without need for an object
 */
class Car4 {
    companion object {
        fun provideDrivingInstructions(): String {
            return "Drive safe!"
        }
    }
}