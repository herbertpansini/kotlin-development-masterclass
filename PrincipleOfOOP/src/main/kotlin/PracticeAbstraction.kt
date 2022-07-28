fun main(args: Array<String>) {
    val myDog: Dog = Pug("Pug")
    val yourDog: Dog = BassetHound("Basset Hound")
    val hisDog: Dog = Chihuahua("Chihuahua")

    myDog.toString()
    yourDog.toString()
    hisDog.toString()
}

abstract class Dog(name: String) {
    abstract fun run()
    abstract  fun bark()
    abstract fun play()

    override fun toString() = "${run()} ${bark()} ${play()}"
}

class Pug(val name: String): Dog(name) {
    override fun run() = println("A $name can run")

    override fun bark() = println("A $name cannot bark")

    override fun play() = println("A $name can play")
}

class BassetHound(val name: String): Dog(name) {
    override fun run() = println("A $name cannot run")

    override fun bark() = println("A $name can bark")

    override fun play() = println("A $name can play")
}

class Chihuahua(val name: String): Dog(name) {
    override fun run() = println("A $name can run")

    override fun bark() = println("A $name can definitely bark")

    override fun play() = println("A $name cannot play")
}