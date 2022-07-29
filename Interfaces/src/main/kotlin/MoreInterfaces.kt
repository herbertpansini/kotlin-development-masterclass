fun main(args: Array<String>) {
    val child = Child()
    child.raisePet()
}

/**
 * A class can implement multiple interfaces
 * An interface has no constructor
 * An interface can implement methods but doesn't need to
 * An interface cannot initialize values
 *  but can update them
 * An interface can inherit from another
 *  interface
 */
interface Pet {
    var cutenessLevel: Int
    fun startPlaying()
    fun feed()
}

class Puppy: Pet {
    override var cutenessLevel: Int = 10

    override fun startPlaying()  = println("Dogs play by running jumping and barking")

    override fun feed() = println("Give doggy treats")
}

class Child {
    val pet: Pet

    init {
        val petStore = PetStore()
        pet = petStore.getPet()
    }

    fun raisePet() {
        for(i in 1..pet.cutenessLevel)
            pet.startPlaying()
        pet.feed()
    }
}

class PetStore {
    fun getPet() = Puppy()
}