fun main(args: Array<String>) {
    val container: Container = Bottle()
    container.pour()
}

/**
 * Abstraction
 * A common feature of 2 classes should be abstracted in a third class
 */

/**
 * Functionality that is not associated with an instance (object) should be abstracted away
 * In practice
 *  if 2 classes share common features, create a super class that contains the common features and inherit from it
 *  Use interfaces (future section)
 * The keyword "abstract" means class cannot be instantiated only extended from
 * Reduces code duplication
 * Structures code based on real world concepts
 *  Both bottle and jug are containers
 * Helps remove irrelevant code and puts it in a separate class
 */
abstract class Container {
    abstract fun pour()
}

class Bottle: Container() {
    override fun pour() = println("Pouring bottle")

    fun fill() = println("Filling bottle")
}

class Jub: Container() {
    override fun pour() = println("Pouring jug")
}