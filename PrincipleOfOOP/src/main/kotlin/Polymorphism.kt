fun main(args: Array<String>) {
    val mom = MyMom()
    val daughter = MyDaughter()

    daughter.say("Hi")

    mom.say("Hi")
    mom.say()
    mom.say(4)
    mom.say("Hello daughter", 2)
}

/**
 * Polymorphism
 * Same name many forms
 * A method/function can do different things in different situations
 * 2 types
 *  Dynamic -> method overriding
 *  Static -> method overloading
 * Amount and type of parameters are important
 */
open class MyMom {
    open fun say(message: String) = println("Mom says $message")

    fun say() = println("Mom says hi how are you")

    fun say(times: Int) {
        for(i in 1..times)
            println("Mom says hello")
    }

    fun say(message: String, times: Int) {
        for (i in 1..times)
            println("Mon says $message")
    }
}

class MyDaughter: MyMom() {
    override fun say(message: String) = println("Daughter says $message")
}