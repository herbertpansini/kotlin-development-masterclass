fun main(args: Array<String>) {
    printHello(5, "Mary", "John", "Alex", "Michelle")
}

fun printHello(count: Int, vararg names: String) {
    for(name in names) {
        for(i in 1..count) {
            println("Hello, $name!")
        }
        println()
    }
}