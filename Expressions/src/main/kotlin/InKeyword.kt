fun main(args: Array<String>) {
    /**
     * The in keyword checks whether
     * A value is in a collection
     * "cat" in listOf("dog", "cat", "horse") // true
     * 3 in setOf(1, 5, 8, 34) // false
     */
    val favouritePet = "dog"
    val availablePets = listOf("cat", "dog", "horse")
    if (favouritePet in availablePets) {
        println("We have your next best friend")
    } else {
        println("Sorry, $favouritePet is not available")
    }
    /**
     * A value is in a range
     * 5 in 1..10 // true
     * 15 in 1..10 // false
     */

    /**
     * The !in keyword checks whether
     * A value is not in a collection
     * "cat" !in listOf("dog", "cat", "horse") // false
     * 3 !in setOf(1, 5, 8, 34) // true
     */
    println("Enter your preferred coffee")
    val coffee = readLine() ?: ""
    val availableCoffee = listOf("capuccino", "mocha")
    if (coffee !in availableCoffee)
        println("Sorry, we don't have your coffee")
    else
        println("$coffee is available")

    /**
     * A value is not in a range
     * 5 !in 1..10 // false
     * 15 !in 1..10 // true
     */
    println("Please enter a number")
    val input = readLine() ?: "0"
    val number = input.toInt()
    if (number !in 0..9)
        println("Your number is not single digit")
}