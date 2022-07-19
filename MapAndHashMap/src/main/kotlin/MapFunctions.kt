fun main(args: Array<String>) {
    val count = mapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println(count.size)
    println(count.containsKey(2))
    println(count.containsKey(5))


    println(count.containsValue("One"))
    println(count.containsValue("Five"))

    println(count.isEmpty())
}