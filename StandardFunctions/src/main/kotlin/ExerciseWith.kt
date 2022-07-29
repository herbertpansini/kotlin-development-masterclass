fun main(args: Array<String>) {
    with(Store()) {
        shoes = 25
        shirts = 10
        jackets = 43
        printInventory()
    }
}

class Store {
    var shoes = 10
    var shirts = 20
    var jackets = 30

    fun printInventory() = println("The store has $shoes pair of Shoes, $shirts Shirts and $jackets Jackets.")
}