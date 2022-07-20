fun main(args: Array<String>) {
    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
    var index = 0
    while(index < cats.size)
        println("Hello, ${cats[index++]}")

    println("Please enter a number")
    val input = readLine() ?: ""
    val number = input.toInt()
    var i = 1
    var result = 1
    while(i <= number)
        result *= i++
    println("$number! = $result")
}