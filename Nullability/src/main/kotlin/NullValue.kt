fun main(args: Array<String>) {
    /**
     * Kotlin differentiates between variables that can be null
     * and those that cannot
     * Using the "?" operator
     */
    val herName: String = "Lilly"
    val hisName: String? = null

    /**
     * If a variable cannot be null, it must be given a value
     * if a variable can be null, giving it a value is optional
     * in this case you must provide the value null
     */
    println(herName)
    println(hisName)

    /**
     * The null keyword is used to assign the value null to a nullable value
     */

    var catName: String? = "Chonkers"
    catName = null // OK

    var dogName: String = "Fluffy"
    //dogName = null // Compilation error
}