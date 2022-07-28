fun main(args: Array<String>) {
    val newLaptop = Laptop("Windows 10")
}

class Laptop(val operationgSystem: String) {

    init {
        println("Operating system $operationgSystem is installing")
    }
}
