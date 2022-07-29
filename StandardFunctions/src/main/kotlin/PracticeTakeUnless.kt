fun main(args: Array<String>) {
    val clients = listOf("Alice", "Bob", "Carol", "Alex", "Dan")
    println(clients)

    val newClients = arrayListOf<String>()
    for (client in clients) {
        client.takeUnless { it[0] == 'A' }
            ?.let { newClients.add(it) }
    }
    println(newClients)
}