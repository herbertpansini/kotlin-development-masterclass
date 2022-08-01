fun main(args: Array<String>) {
    val myComputer = Computer()
    myComputer.bootUp()
}

class Computer {
    fun bootUp() {
        println("Booting up computer")
        val os = OperatingSystem()
        os.startOs()
        println("Computer ready")
    }

    inner class OperatingSystem {
        fun startOs() = println("Os started")
    }
}