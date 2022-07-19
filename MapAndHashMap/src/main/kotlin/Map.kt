fun main(args: Array<String>) {
    /**
     * A map is a set of key-value pair
     * keys are unique, values can be duplicates
     */
    val count = mapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println(count)

    /**
     * If we create an empty map,
     * we must specify both the key and value types
     */
    val count2 = mapOf<Int, String>()
    println(count2)

    /**
     * Get a value based on a key
     */
    println(count[2])

    /**
     * Get the whole set of keys (they are unique)
     */
    println(count.keys)

    /**
     * Get the collection of values (can have duplicates)
     */
    println(count.values)
}