fun main(args: Array<String>) {
    /**
     * Curly brackets can be omitted if there is only one expression
     */
    val number = 25
    var isEven: String? = null
    if (number % 2 == 0)
        isEven = "Number is even"
    else
        isEven = "Number is odd"

    /**
     * Shorthand if expression
     */
    if (number % 2 == 0) isEven = "Number is even" else isEven = "Number is odd"

    /**
     * If as an expression
     * An if statement can return a result
     */
    isEven = if (number % 2 == 0) "Number is even" else "Number is odd"

    println(isEven)
}