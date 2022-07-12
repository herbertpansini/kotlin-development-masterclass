fun main(args: Array<String>) {
    var tvShows = "many"
    println(tvShows)
    tvShows = "too many"
    println(tvShows)

    /**
     * Changeable (mutable)
     * var
     */
    var age = 25
    //age = "many" // Error: Type mismatch Required: Int Found: String

    /**
     * Read only (immutable)
     * val
     */
    val color = "blue"
    //color = "red" // Error: Val cannot be reassigned
}