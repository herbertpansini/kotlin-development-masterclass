fun main(args: Array<String>) {
    DatabaseAccess.connected = true
    if (DatabaseAccess.connected)
        DatabaseAccess.disconnected()
    else
        DatabaseAccess.connect()

    println("Database is connected: ${DatabaseAccess.connected}")
}

object DatabaseAccess {
    var connected = false
    fun connect() {
        connected = true
        println("Connected to the database")
    }

    fun disconnected() {
        connected = false
        println("Disconnected to the database")
    }

}