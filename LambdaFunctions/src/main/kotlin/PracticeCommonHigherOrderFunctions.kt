fun main(args: Array<String>) {
    val numbers = setOf(3, 456, 34, 67, 4, 567, 34, 6575)
    println(numbers.filter { it in 10..99 })

    val clients = listOf("Tom", "Laura", "Dennis", "Mark")
    println(clients.sortedBy { it[it.length -1] })

    val ints = listOf(372, 285, 836, 994, 836, 216)
    println(ints.maxByOrNull { it.toString()[1].digitToInt() })
    println(ints.maxByOrNull { it / 10 % 10 })
}