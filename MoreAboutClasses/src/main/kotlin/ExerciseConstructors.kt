fun main(args: Array<String>) {
    val user1 = UserAccount()
    val user2 = UserAccount("John")
    val user3 = UserAccount("Mary", 175)
    val user4 = UserAccount("Anna", 2635)
}

class UserAccount {

    constructor() {
        this.userName = "Generic user"
        this.balance = 1
        this.canAfford()
    }

    constructor(userName: String) {
        this.userName = userName
        this.balance = 2
        this.canAfford()
    }

    constructor(userName: String, balance: Int) {
        this.userName = userName
        this.balance = balance
        this.canAfford()
    }

    var userName = "User name"
    var balance = 0
    private val tshirtPrice = 20

    private fun canAfford() {
        if (this.balance > tshirtPrice)
            println("$userName can afford ${balance / tshirtPrice} tshirts with the balance $balance")
        else
            println("$userName cannot afford any tshirts with the balance $balance")
    }
}