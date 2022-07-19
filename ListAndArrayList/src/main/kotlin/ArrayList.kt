fun main(args: Array<String>) {
    /**
     * A mutable (changeable) list
     */
    val colors = arrayListOf("Blue", "Red")
    println(colors)
    val noColors = arrayListOf<String>()
    println(noColors)
    /**
     * We can add elements
     */
    colors.add("Yellow")
    println(colors)
    /**
     * Add another collection
     */
    val moreColors = arrayListOf("Pink", "Teal")
    colors.addAll(moreColors)
    println(colors)
    /**
     * Remove an element
     */
    colors.remove("Red")
    println(colors)
    /**
     * Remove all elements of a colletion
     */
    colors.removeAll(moreColors)
    println(colors)
    /**
     * Remove an element at position
     */
    colors.removeAt(1)
    println(colors)
    /**
     * If the list contain duplicate elements, the remove function only removes
     * the first element
     */
    colors.add("Red")
    colors.add("Blue")
    colors.remove("Blue")
    println(colors)
}