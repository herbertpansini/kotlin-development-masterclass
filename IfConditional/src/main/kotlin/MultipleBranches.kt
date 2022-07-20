fun main(args: Array<String>) {
    println("Please enter an animal")
    val animal = readLine() ?: "Cat"
    val action = if (animal == "Dog")
        "Pet it"
    else if (animal == "Cat")
        "Feed it"
    else if (animal == "Crocodile")
        "Run away"
    else
        "Google it"

    println("If you encounter a $animal you should $action")
}