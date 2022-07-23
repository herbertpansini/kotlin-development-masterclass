fun main(args: Array<String>) {
    feedAnimal("cat")
    feedAnimal(setOf("dog", "bear", "shark"))

    printSize("Hello how are you")
    printSize(8)
}

fun feedAnimal(animal: String) = println("Feedin the $animal")

fun feedAnimal(animals: Collection<String>) {
    for(animal in animals)
        feedAnimal(animal)
}

fun printSize(message: String) = println("'$message' has a size of ${message.length}")

fun printSize(size: Int) {
    var message = ""
    for(i in 1..size)
        message += "a"
    println("A message of $size is '$message'")
}