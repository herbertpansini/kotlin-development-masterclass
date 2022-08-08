import kotlin.random.Random

fun main(args: Array<String>) {
    val list by lazy { generateList() }
    println("Should the list be generated? (yes/no)")
    val input = readLine() ?: ""
    if (input == "yes")
        println(list)
}

fun generateList(): List<Int> {
    val integers = arrayListOf<Int>()
    for (i in 1..10000)
        integers.add(Random.nextInt(1000))
    return integers
}