fun main(args: Array<String>) {
    /**
     * Printing a matrix (table)
     */
    for(i in 1..5) {
        for (j in 1..5) {
            print("$i, $j\t")
        }
        println()
    }

    val matrixSize = 9
    for(i in 0..matrixSize) {
        for(j in 0..matrixSize) {
            if (i == j)
                print("Diagonal\t")
            else
                print("$i, $j \t\t")
        }
        println()
    }
}