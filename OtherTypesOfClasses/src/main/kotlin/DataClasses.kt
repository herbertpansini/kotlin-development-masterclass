/**
 * Commonly create classes just for storing data
 * Primary constructor has at least on parameter
 * All primary constructor parameters need to be val or var
 * Can have a body but not required
 */
fun main(args: Array<String>) {
    val myUser = User("John", "john@gmail.com", "johnIsCool")
    println(myUser)
}

data class User(
    val name: String,
    val email: String,
    val password: String
)