fun main(args: Array<String>) {
    val clients = listOf("Anna", "Bob", "Carol", "Dan")
    clients.filter { it.length < 5 }
        .forEach { println("Hello $it") }

    println(clients.map { it.length })

    println(clients.sortedBy { it.length })

    println(clients.maxByOrNull { it.length })

    println(clients.minByOrNull { it.length })
}