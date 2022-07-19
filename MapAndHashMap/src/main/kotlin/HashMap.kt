fun main(args: Array<String>) {
    /**
     * A mutable map
     */
    val count = hashMapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"), Pair(5, "Five"))
    println(count)

    /**
     * Adding a key-value pair
     */
    count.put(4, "Four")
    println(count)

    /**
     * Adding all elements of another map
     */
    val countMore = mapOf(Pair(20, "Twenty"), Pair(30, "Thirty"))
    count.putAll(countMore)
    println(count)

    /**
     * Remove an element
     */
    count.remove(20)
    println(count)

    /**
     * Replace a value
     */
    count.replace(2, "TwoTwo")
    println(count)

    /**
     * Remove all elements
     */
    count.clear()
    println(count)
}