fun main(args: Array<String>) {
    /**
     * A Higher Order Functions is a function that takes another function as a parameter
     */
    sayHello(arrayListOf("Alice", "Bob", "Carol", "Dan"))
        { name: String -> println("Hello there $name") }
}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for(name in names)
        doSomething(name)
}