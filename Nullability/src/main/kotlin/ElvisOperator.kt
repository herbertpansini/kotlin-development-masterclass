fun main(args: Array<String>) {
    /**
     * ?: Guarantees a result returned
     * Either the actual result for a non-null variable, or a default value
     */
    var catName: String? = null
    println(catName ?: "This cat has no name")
    /**
     * After an Elvis operator, there's no need for null safety
     * because the Elvis operator guarantees a value
     */
    println(catName ?: "Fluffy".length)
}