fun main(args: Array<String>) {
    /**
     * !!. A developer guarantee that the variable is not null
     * Warning: This bypasses all the language checks for null safety
     * Can trigger a program crash
     * 
     * Try to avoid it as much as you can
     */
    var catName: String? = null
    catName = "Fluffy"
    println(catName!!.length) // If the value is null, the program will crash
}