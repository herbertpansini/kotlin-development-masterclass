fun main(args: Array<String>) {
    val car = WeirdCar()
    car.speed = 100
    println("car.name ${car.name}")
    println("car.speed ${car.speed}")
}

/**
 * Allow us to change the way variables are assigned and retrieved
 * If we define a custom getter, it will be called every time we access the variable
 * If we define a custom setter, it will be called every time we access the variable
 */
class WeirdCar {
    var name = ""
    var speed: Int = 50
        get() = field
        set(value) {
            name = "High speed car $value"
            field = value
        }
}
