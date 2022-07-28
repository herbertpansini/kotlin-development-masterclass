fun main(args: Array<String>) {
//    val myCar = Car("BMW", 220)
    val myCar = Car()
    val yourCar = Car("BMW")
    val hisCar = Car("Fiat", 220)
}

/**
 * Defines a set of variables that are available at the creation of an object
 */
/**
 * Only one constructor
 */
//class Car(val model: String, val topSpeed: Int)

/**
 * A class can have multiple ways of being created
 * Which constructor is used depends on parameters
 */
class Car {
    constructor() {
        this.model = "No Model"
        this.topSpeed = 150
    }

    constructor(model: String) {
        this.model = model
        this.topSpeed = 150
    }

    constructor(model: String, topSpeed: Int) {
        this.model = model
        this.topSpeed = topSpeed
    }

    var model: String? = null
    var topSpeed: Int = 100
}

