fun main(ars: Array<String>) {
    val boieng737 = Boieng()
    val a320 = AirBus()

    boieng737.name = "Boieng 737"
    boieng737.speed = 700

    a320.name = "AirBus A320"
    a320.speed = 800

    boieng737.ascend()
    a320.descend()
    boieng737.descend()
    a320.ascend()
    a320.ascend()
    boieng737.descend()
}

open class Airplane {
    var name = "Generic Airplane"
    var speed = 1000
    var altitude = 20000

    fun ascend() {
        altitude += 1000
        println("$name has an altitude of $altitude and speed $speed")
    }

    fun descend() {
        altitude -= 1000
        println("$name has an altitude of $altitude and speed $speed")
    }
}

class Boieng: Airplane()

class AirBus: Airplane()