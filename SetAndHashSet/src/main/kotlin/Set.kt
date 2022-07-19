fun main(args: Array<String>) {
    /**
     * Stores unique elements in an undefined order
     */
    val numbers = setOf(6, 37, 6, 42)
    println(numbers) // [6, 37, 42]

    /**
     * If we create an empty set, we must specify the type
     */
    val numbers2 = setOf<Int>()
    println(numbers2)

    /**
     * A set can contain a null element, but only one
     */
    val numbers3 = setOf(6, 5, 2, null, 8, 5, 7, null, 4, null)
    println(numbers3)
}