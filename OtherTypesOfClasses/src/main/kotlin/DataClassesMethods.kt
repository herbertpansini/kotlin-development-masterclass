/**
 * Automatically generated class methods
 *  equals() or ==
 *      Compares data not object references
 *  toString()
 *      Prints out variable names and data
 *  copy()
 *      Creates a copy with only some data changed
 */
fun main(args: Array<String>) {
    val regularUser1 = RegularUser("John", "john@gmail.com", "johnIsCool")
    val regularUser2 = RegularUser("John", "john@gmail.com", "johnIsCool")
    println(regularUser1 == regularUser2) // false
    println(regularUser1.toString()) // RegularUser@87aac27

    val user1 = User("John", "john@gmail.com", "johnIsCool")
    val user2 = User("John", "john@gmail.com", "johnIsCool")
    println(user1 == user2) // true
    println(user1.toString()) // User(name=John, email=john@gmail.com, password=johnIsCool)

    val user3 = user2.copy(email = "john1@gmail.com")
    println(user3)
}

class RegularUser(
    val name: String,
    val email: String,
    val password: String
)