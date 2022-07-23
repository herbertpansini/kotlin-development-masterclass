fun main(args: Array<String>) {
    val numbers = arrayListOf(3, 8, 6, 5, 435, 56, 34, 768, 45)
    println(numbers)
    println(update(numbers) { number -> number / 10})
}

fun update(numbers: ArrayList<Int>, lbd: (Int) -> Int) : ArrayList<Int> {
    for (i in 0..numbers.size -1) {
        if (numbers[i] % 2 == 0)
            numbers[i] = lbd(numbers[i])
    }
    return numbers
}