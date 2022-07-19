fun main(args: Array<String>) {
    /**
     * Ordered collection that can contain duplicate elements
     */
    val colors = listOf("Blue", "Red", "Yellow")
    println(colors)
    /**
     * If we create an empty list, we must specify the element type
     */
    val colors2 = listOf<String>()
    println(colors2)
    /**
     * A list can contain duplicate elements
     */
    val colors3 = listOf("Blue", "Red", "Blue", "Green", "Blue")
    println(colors3)
    /**
     * Can contain nulls
     */
    val colors4 = listOf("Blue", "Red", "Blue", null, null)
    println(colors4)

    /**
     * Retrieve an element of the list
     */
    println(colors[0]) // Blue
    println(colors[1]) // Red
    println(colors.get(1)) // Red
//    println(colors[5]) // Exception
    /**
     * Retrieve the size of the list
     */
    println(colors3.size)
}