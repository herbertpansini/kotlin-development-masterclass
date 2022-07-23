/**
 * A way to group code that can be executed 0 or more times
 * May not get the same result on different runs
 * Can accept input and return output
 * Create a function
 *  fun functionName() {
 *      // do something
 *  }
 *  Call / Invoke a funcion
 *      functionName()
 */

fun main(args: Array<String>) {
    for(i in 1..3) {
        sayHello()
    }

    var i = 5
    do {
        printAlphabet()
        i--
    } while(i > 0)
}
fun sayHello() {
    println("Hello everyone")
}

fun printAlphabet() {
    println(setOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'))
}