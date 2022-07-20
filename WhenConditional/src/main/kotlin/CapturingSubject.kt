fun main(args: Array<String>) {
    /**
     * It's possible to capture the value in a when statement
     * and use it in the block
     */
    val name = "Michelle"
    when (val length = name.length) {
        in 1..5 -> println("A name with $length characters is short")
        in 6..10 -> println("A name with $length characters is medium")
        else -> println("A name with $length characters is long")
    }
    /**
     * This is useful when getting the result of a function
     * (more on that later in the course)
     */
}