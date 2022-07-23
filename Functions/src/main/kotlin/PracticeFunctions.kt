fun main(args: Array<String>) {
    /**
     * Design a function that print a hello message
     * Call it 10 times
     */
    for(i in 1..10)
        printHello()

    /**
     * Design a function that asks a user for a number, multiples that number
     * by 17 and prints out the result
     * Call the function 3 times
     */
    for(i in 1..3)
        multiplyNumber()
}

fun printHello() {
    println("Hello, how are you")
}

fun multiplyNumber() {
    println("Please enter a number")
    val input = readLine() ?: ""
    val number = input.toInt()
    println("$number * 17 = ${number * 17}")
}