fun main(args: Array<String>) {
    val petStore = listOf("Cat", "Dog", "Rabbit")
    val hasCatFood = true

    if (petStore.contains("Cat")) {
        if (hasCatFood) {
            println("Buy Cat and Cat food")
        } else {
            println("Buy Cat only")
        }
    } else {
        println("Ask the pet store owner to get a Cat")
    }
}