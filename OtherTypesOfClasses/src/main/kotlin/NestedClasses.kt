fun main(args: Array<String>) {
    val myCar = Car3()
    myCar.drive()
}

/**
 * A nested class is created inside another class
 * The inner class can access variables and methods of the outer class
 * this@Car is the reference
 * The outer class can create an instance of the inner class
 */
class Car3 {
    private val engine = Engine()
    var speed = 100
    fun drive() {
        engine.run()
        println("Driving at $speed")
    }

    private inner class Engine {
        val rpm = 1000
        fun run() {
            println("Engine is running at $rpm rpm")
            this@Car3.speed = 150
//            this@Car3.drive()
        }
    }
}