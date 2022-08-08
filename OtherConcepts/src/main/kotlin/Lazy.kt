import kotlin.random.Random

/**
 * lazy variables are variables that are initialized when needed
 * Useful to save memory in case the variables is never accessed
 */
fun main(args: Array<String>) {
    val someLargeVariable: String by lazy { "Some large value" }
    if (Random.nextInt() % 2 == 0)
        println(someLargeVariable)
}