import java.time.LocalDate

/**
 * Design a function that asks for a user's name. Then it asks for a user's birth year
 * Finally, it prints out a message saying the user's name and age.
 * Call the function 3 times
 */
fun main(args: Array<String>) {
    for(i in 1..3)
        askDetails()
}

fun askDetails() {
    println("Please enter your name")
    val name = readln() ?: ""
    println("Please enter your birth year")
    val input = readLine() ?: ""
    val year = input.toInt()
    println("$name is ${LocalDate.now().year - year -1} or ${LocalDate.now().year - year}")
}