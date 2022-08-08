fun main(args: Array<String>) {
    val value = "Testing my Strings"
    if (value is String) {
        println("This string has ${value.length} characters")
    }

    val myCar: Car = getCar()
//    if (myCar !is BMW)
//        println("This is not my favourite brand")
//    if (myCar is BMW)
//        (myCar as BMW).drive()

    (myCar as? BMW)?.drive()

}

open class Car
class BMW: Car() {
    fun drive() = println("Driving my BMW")
}

fun getCar(): Car = BMW()