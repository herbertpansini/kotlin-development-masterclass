fun main(args: Array<String>) {
    val myOven: Oven = getOven()
    myOven.turnOn()
    myOven.cook(150)
    myOven.turnOff()
}

/**
 * An interface is a definition of a part of class
 * Tell you what a class/object can do
 * Objects can access other objects through their interfaces
 * Very similar to abstract class
 * Can be used as variable types
 */
interface Oven {
    val temperature: Int
    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) = println("Cooking at $temp degrees")
}

class Bosch: Oven {
    override val temperature: Int = 180

    override fun turnOn() = println("Turn on")

    override fun turnOff() = println("Turn off")
}

fun getOven(): Oven = Bosch()