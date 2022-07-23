fun main(args: Array<String>) {
    println("A circle with the radius has an area of ${calculateCircleArea(10)}")

    for (person in listOf("Anna", "Bob", "William"))
        println(personaliseGreeting(person))
}

fun calculateCircleArea(radius: Int) = 3.1415 * radius * radius

fun personaliseGreeting(person: String): String {
    val greeting = when(person[0]) {
        'A' -> "Are you ok $person"
        'W' -> "What's up $person"
        else -> "Hi $person"
    }
    return greeting
}