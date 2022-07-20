fun main(args: Array<String>) {
    /**
     * Ranges can be ascending
     *      1..10
     * or descending
     *      10 downTo 0
     * can skip steps
     *      10 downTo 0 step 3
     */
    for(i in 1..3)
        println("Strike #$i")
    println("You're out!")

    for(i in 10 downTo 0) {
        println(i)
        when(i) {
            9 -> println("Start your engines")
            6 -> println("On your marks")
            3 -> println("Get set")
            0 -> println("GO!")
        }
    }

    for(i in 10 downTo 0 step 3)
        println(i)
}