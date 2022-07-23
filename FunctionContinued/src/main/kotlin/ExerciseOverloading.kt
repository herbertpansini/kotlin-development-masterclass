fun main(args: Array<String>) {
    cost("Coffee", 4.99)
    cost(mapOf(Pair("cake", 3.99), Pair("can of soda", 1.60)))
}

fun cost(product: String, price: Double?) = println("A $product costs ${price?.times(1.2)}")

fun cost(products: Map<String, Double>) {
    for(product in products.keys)
        cost(product, products[product])
}