fun main(ars: Array<String>) {
    val jetPack = JetPack()
    jetPack.burn(10)
    println("User height is ${jetPack.userHeight}")
    jetPack.stop(2)
    println("User height is ${jetPack.userHeight}")
    jetPack.burn(5)
    println("User height is ${jetPack.userHeight}")
    jetPack.stop(8)
    println("User height is ${jetPack.userHeight}")
}

class JetPack {
    var userHeight = 0

    fun burn(seconds: Int) {
        println("Burning for $seconds seconds")
        userHeight += seconds
    }

    fun stop(seconds: Int) {
        println("Stopping for $seconds seconds")
        userHeight -= 3 * seconds
        if (userHeight < 0)
            userHeight = 0
    }
}