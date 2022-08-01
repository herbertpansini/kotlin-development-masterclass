fun main(args: Array<String>) {
    println("Michael".betterLength)
}

/**
 * Can add properties to classes, in a similar way to functions
 * They cannot be local, i.e. declared inside a functions or class
 * Cannot update an extension property
 *  can only use values (val), not variables (var)
 * The property is not actually inserted into the class
 * The extension properties are a shortcut for the . notation
 * Therefore initializers are not allowed
 */
val String.betterLength: Int
    get() = 200