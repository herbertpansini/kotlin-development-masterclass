fun main(args: Array<String>) {
    val animal = "cat"
    var action = ""
    when (animal) {
        "cat" -> {
            action = "Feed it"
        }
        "dog" -> {
            action = "Pet it"
        }
        else -> {
            action = "Google it"
        }
    }
    println("When you meet a $animal you should $action")

    var result = ""
    val number = 2345
    when (number % 2) {
        0 -> result = "Number is even"
        1 -> result = "Number is odd"
    }
    println(result)
    
    /**
     * Inside a when code block you can have any code you like
     * Including more when statements
     * when (variable) {
     *  value1 -> {
     *      // do something
     *  }
     *  value2 -> {
     *      when (variableB) {
     *          valueB1 -> {
     *          }
     *          valueB2 -> {
     *          }
     *      }
     *  }
     */
}