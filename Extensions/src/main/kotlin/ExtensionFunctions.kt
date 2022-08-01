fun main(args: Array<String>) {
    val name = "Michael"
    println(name.slim())
}

/**
 * Allow us to extend a class that we don't own or cannot modify
 * Without the need to inherit from that class
 * Add functionality that is available in the context of our program only
 * Added code can be called in the usual way
 *  by declaring objects of that class and invoking methods
 * Can extend
 *  - Functions
 *  - Properties
 *  - Companion object
 */
fun String.slim() = this.substring(1, length -1)