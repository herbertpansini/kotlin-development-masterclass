fun main(args: Array<String>) {
    /**
     * All set functions apply to HashSet
     */
    val numbers = hashSetOf(3, 7, 5, 4, 6)
    val newNumbers = setOf(7, 2, 5, 9, 6)
    println(numbers.retainAll(newNumbers)) // [5, 6, 7]
    println(numbers)

    numbers.clear()
    println(numbers)

    println(numbers.isEmpty())
}