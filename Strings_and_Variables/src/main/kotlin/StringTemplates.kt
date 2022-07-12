fun main(args: Array<String>) {
    val dogName = "Teddy"

    /**
     * String in Kotlin can contain expressions
     * The expression is evaluated and inserted (concatenated) into the string
     * An expression starts with a $ sign and can have braces {}
     */
    println("My dog's name is $dogName")

    println("I have ${1 + 1} cats")
}