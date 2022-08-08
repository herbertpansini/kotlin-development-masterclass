/**
 * Allows us to create non-null, non initialized variables
 * Need to initialize the variables before using it
 * Accessing it before initializing it throws an exceptions
 * Can be used only on var variables
 * Use .isInitialized to check initialization
 * Common use cases
 *  - dependency injection
 *  - unit testing
 */
fun main(args: Array<String>) {
    lateinit var networkService: String
    networkService = getNetworkService2()
    println(networkService)
}

fun getNetworkService2() = "Network service"