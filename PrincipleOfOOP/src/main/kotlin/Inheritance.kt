fun main(args: Array<String>) {
    val carol = Daughter("French")
    println(carol.hairColor)
    carol.say("Hi")
}

/**
 * Inheritance
 * Classes can inherit methods and parameters from other classes
 */

/**
 * A class can inherit variables and methods from another class
 * To make a class inheritable, use the "open" keyword
 */

/**
 * "Daughter" classses can override variables in "Mother" classes by creating a variable of the same name
 * "Daughter" classses can override variables in "Mother" classes using the "override" keyword
 * "Daughter" classses can override variables in "Mother" class methods and variables using the "super" keyword
 */
open class Mom(nativeTongue: String) {
    open val hairColor = "Brown"
    val eyeColor = "Blue"

    open fun say(message: String) = println("Mon says $message")
}

class Daughter(nativeTongue: String): Mom(nativeTongue) {
    override val hairColor = "Blonde"

    override fun say(message: String) {
        println("Daughter says $message")
        super.say(message)
        println("Mother has ${super.hairColor} hair color")
    }
}