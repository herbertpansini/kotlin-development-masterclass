fun main(args: Array<String>) {
    val test = readLine()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        e.printStackTrace()
        println("An exception has occurred \n ${e.localizedMessage}")
    } finally {
        println("The execution has completed")
    }
}