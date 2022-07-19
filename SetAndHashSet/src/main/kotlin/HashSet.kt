fun main(args: Array<String>) {
    /**
     * A mutable set
     */
    val numbers = hashSetOf(3, 7, 5, null, 7)
    val noNumbers = hashSetOf<Int>()
    println(numbers)
    println(noNumbers)
    /**
     * We can add elements to a hashSet
     */
    numbers.add(44)
    println(numbers)

    /**
     * Add another set
     */
    val newNumbers = setOf(56, 34, 78)
    numbers.addAll(newNumbers)
    println(numbers)

    /**
     * Remove an element
     */
    numbers.remove(56)
    println(numbers)

    /**
     * Remove all elements of a set
     */
    val toRemove = setOf(3, 5, 8745)
    numbers.removeAll(toRemove)
    println(numbers)
}