fun main(args: Array<String>) {
    val dealer = CarDealer()
    var myCar = dealer.rentAffordableCar()
    myCar.rent()

    myCar = dealer.rentLuxuryCar()
    myCar.rent()
}

interface RentalCar {
    var price: Int
    fun rent()
}

class AffordableCar: RentalCar {
    override var price: Int = 1000

    override fun rent() = println("The affordable car cost $price")
}

class LuxuryCar: RentalCar {
    override var price: Int = 5000

    override fun rent() = println("The luxury car cost $price")
}

class CarDealer {
    fun rentAffordableCar(): RentalCar = AffordableCar()

    fun rentLuxuryCar(): RentalCar = LuxuryCar()
}