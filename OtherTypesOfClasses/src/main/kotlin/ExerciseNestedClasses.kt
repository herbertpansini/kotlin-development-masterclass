fun main(args: Array<String>) {
    val myPlane = AirPlane()
    myPlane.takeOff()
}

class AirPlane {
    private val engine1 = Engine("Engine 1")
    private val engine2 = Engine("Engine 2")

    fun takeOff() {
        println("Getting ready for take off")
        engine1.startEngine()
        engine2.startEngine()
        println("Taking off")
    }

    private inner class Engine(val name: String) {
        fun startEngine() = println("Engine $name started")
    }
}