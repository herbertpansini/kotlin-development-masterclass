fun main(args: Array<String>) {
    /**
     *  Operation       Non-null operator       Replacement method
     *  Addition        +                       ?.plus()
     *  Substration     -                       ?.minus()
     *  Multiplication  *                       ?.times()
     *  Division        /                       ?.div()
     *  Remainder       %                       ?.rem()
     */
    val a: Int? = 10
    println(a?.plus(3))
    println(a?.minus(3))
    println(a?.times(3))
    println(a?.div(3))
    println(a?.rem(3))
}