/**
 * Allows us to run code on an object
 * We can access the result as a lambda argument
 *  "it" by default
 * If the block of code contains a single function call, we can use the
 * method reference ::
 */
fun main(args: Array<String>) {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length }
        .filter { it > 3 }
//        .let {filteredList ->
//            println(filteredList)
//            println("Size of list is ${filteredList.size}")
//        }
        .let(::println)

    /**
     * A common use case is to use "let" to filter for non-null variables
     */
    val name = readLine()
    name?.let { println("Your name is $name") }
}