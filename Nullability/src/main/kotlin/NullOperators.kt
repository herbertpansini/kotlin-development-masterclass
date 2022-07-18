fun main(args: Array<String>) {
    /**
     * returns either null if catName is null
     * or the actual String length
     */
    var catName: String? = "Chonkers"
    println(catName?.length?.toString())
    catName = null

    /**
     * Safe calls can be chained for multiple operations
     */
    println(catName?.length?.toString())

    /**
     * Always returns the String length
     * since catName is certainly not null
     */
    var dogName: String = "Fluffy"
    dogName.length
}