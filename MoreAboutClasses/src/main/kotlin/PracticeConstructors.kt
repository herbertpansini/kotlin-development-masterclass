fun main(args: Array<String>) {
    val table1 = Table()
    val table2 = Table(1)
    val table3 = Table(6, 175)

    println(table1.toString())
    println(table2.toString())
    println(table3.toString())
}

class Table {
    constructor() {
        this.legs = 3
        this.height = 120
    }

    constructor(legs: Int) {
        this.legs = legs
        this.height = 130
    }

    constructor(legs: Int, height: Int) {
        this.legs = legs
        this.height = height
    }

    var legs = 4
    var height = 150

    override fun toString(): String {
        return "This table has $legs legs and a height of $height"
    }
}