/**
 * Classes and Objects
 * In Kotlin, everything is an Object
 * String, Int, Float, Boolean, ArrayList, HashMap
 * Collection, List are interfaces (more on that later)
 */
fun main(args: Array<String>) {
    val animals: ArrayList<String> = arrayListOf("Cat", "Dog", "Horse") // Object
    animals.size // property (attribute)
    animals.get(0) // method (function)

    val table = Table()
    println(table.color)

    val myGarage = Garage()
    myGarage.car.drive()
}

class Table {
    var color: String = "White"
}

class MyCar {
    fun drive() {
        println("Driving along in my car")
    }
}

class Garage {
    val car = MyCar()
}