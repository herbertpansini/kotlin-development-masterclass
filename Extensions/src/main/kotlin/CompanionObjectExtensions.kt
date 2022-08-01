fun main(args: Array<String>) {
    Book.printMe()
}

/**
 * If a class has a companion object defined, we can extend it
 *  With functions and properties
 * If not, we cannot add a companion object
 */

class Book {
    companion object {

    }
}

fun Book.Companion.printMe() = println("Book has been printed")