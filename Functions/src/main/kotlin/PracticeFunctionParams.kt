fun main(args: Array<String>) {
    for (i in 1..3)
        println(additional(i * 5, i * 9))

    val products = hashMapOf(Pair("Shoes", 29.99), Pair("Socks", 5.99), Pair("Jeans", 39.99))
    for (item in products.keys)
        println("$item cost ${addTax(products[item])}")
}

fun additional(p1: Int, p2: Int) = p1 + p2

fun addTax(price: Double?) = price?.times(1.2)