fun main(args: Array<String>) {
    /**
     * A label is used to mark a position in code that you can jump to
     * Can be used with break and continue
     */
    loop@for(i in 1..10) {
        for(j in 1..10) {
            if (i % 3 == 0)
                break@loop // OR continue@loop
            println("$i, $j")
        }
    }
    /**
     * Send the execution to a certain point with labels
     */
}