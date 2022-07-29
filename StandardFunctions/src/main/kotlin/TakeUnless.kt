import kotlin.random.Random

/**
 * Returns the object if the predicate values to false
 * Otherwise returns null
 */
fun main(args: Array<String>) {
    for(i in 1..10) {
        val number = Random.nextInt(100)
        val oddOrNull = number.takeUnless { it % 2 == 0 }

        println("The number is $number")
        println("The even number is $oddOrNull")
    }
}