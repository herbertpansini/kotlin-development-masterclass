fun main(args: Array<String>) {

}

/**
 * Encapsulation
 * Hiding data and inner workings of a class from other classes that
 * don't need to know something is done
 */

/**
 * Variables and functions are available only in the block of code they are declared in
 * Classes can change the scope of their variables / functions
 * Modifiers
 *  private - visible inside the class only
 *  protected - visible inside class and inheriting classes
 *  internal - visible inside package
 *  public - visible to anyone accessing the class
 * Default is public
 */
open class AirPlane {
    val type = "Airbus"

    fun fly() = println("Flying")
}

class MyAirPlane: AirPlane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar() {
    fun start() {
        val airPlane = AirPlane()
        println(airPlane.type)
        airPlane.fly()
    }
}