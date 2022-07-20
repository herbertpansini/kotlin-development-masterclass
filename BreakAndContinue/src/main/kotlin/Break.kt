fun main(args: Array<String>) {
    var onlyEvenNumbers = arrayListOf(2, 6, 4, 8, 7)
    for(number in onlyEvenNumbers) {
        if (number % 2 != 0)
            break
        println("Half of $number is ${number /2}")
    }
}