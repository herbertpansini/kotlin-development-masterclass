fun main(args: Array<String>) {
    /**
     * When can return a value
     */
    val animal = "dog"
    val action = when (animal) {
        "cat" -> "Feed it"
        "dog" -> "Pet it"
        else -> "Google it"
    }
    /**
     * Curly braces are not needed if there is only one line of code
     */
    val month = "January"
    var days = when(month) {
        "January" -> 31
        "February" -> 28
        "March" -> 31
        else -> 30
    }

    /**
     * If two values have the same effect
     * They can be put on the same line, separated by a comma
     */
    days = when(month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }
    println("The month of $month has $days days")
}