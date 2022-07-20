fun main(args: Array<String>) {
    println("Input a boolean value. Is it night time?")
    val input = readLine()
    val night = input.toBoolean()
    if (night) {
        println("Sleep, it's night time")
    } else {
        println("Be active, it's day time")
    }

    println("Please input the funds amount")
    val inputFunds = readLine() ?: ""
    var clientFunds = inputFunds.toInt()
    val price = 50
    var clientProducts = 0
    if (clientFunds > price) {
        clientFunds -= price
        println("You have purchased ${++clientProducts} products")
        println("You have $clientFunds funds")
    } else {
        println("You have insufficient funds to purchase the products")
    }
}