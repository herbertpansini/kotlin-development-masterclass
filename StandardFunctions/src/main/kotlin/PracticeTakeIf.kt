fun main(args: Array<String>) {
    val numbers = listOf(3, 67, 34, 6, 2, 5, 8, 9, 345, 23, 45, 23)
    println(numbers)

    val newNumbers = arrayListOf<Int>()
    for(number in numbers) {
        number.takeIf { it % 2 == 0 }
            ?.let { newNumbers.add(it) }
    }
    println(newNumbers)
}