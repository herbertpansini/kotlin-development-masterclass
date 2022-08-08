fun main(args: Array<String>) {
    lateinit var message: String
    val primeNumber = listOf(2, 3, 5, 7, 11, 13, 17, 23)
    message = "The chose prime number is ${selectPrimeNumber(primeNumber)}"
    println(message)
}

fun selectPrimeNumber(primes: List<Int>) = primes.random()