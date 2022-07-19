fun main(args: Array<String>) {
    val test = readLine()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        e.printStackTrace()
        println("An exception happened \n ${e.localizedMessage}")
    }
}