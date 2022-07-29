fun main(args: Array<String>) {
    val clients = arrayListOf<String?>()
    do {
        println("Enter client name")
        val input = readLine()
        input?.let {
            if (it == "")
                clients.add(null)
            else
                clients.add(it)
        }
    } while(input?.lowercase() != "stop")
    println(clients)

    clients.forEach{
        it?.let {
            println("Hello $it")
        }
    }
}