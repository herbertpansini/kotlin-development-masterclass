/**
 * Values that dot not change
 * Are available at compile time are not calculated during program execution
 * Top level - are declared outside of functions
 * Convention: names are in all-caps
 */
const val URL_LINK = "google.com"

fun main(args: Array<String>) {
    println("Accessing URL $URL_LINK")
}