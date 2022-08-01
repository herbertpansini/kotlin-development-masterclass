fun main(args: Array<String>) {
    val color = Colors.RED
    when(color) {
        Colors.RED -> println("You chose red")
        Colors.GREEN -> println("You chose green")
        else -> println("You chose blue")
    }

    println(Colors.RED.timesUsed)
    println(Colors.GREEN.name)
    println(Colors.BLUE.ordinal)
}

/**
 * Enum constants can be initialized
 * Constants have properties like
 *  - name
 *  - ordinal
 */
enum class Colors(val timesUsed: Int) {
    RED(34),
    GREEN(12),
    BLUE(64)
}