package academy.learnprogramming.generics

fun main(args: Array<String>) {

    val dog = Dog(10)
    val spider = Spider(9000)
    var animal: Animal = dog
    animal = spider


    //1. if a type A is a subtype of B, List<A> can be assigned to List<B>
    //this is called covariance
    //Dog is subtype of Animal, so List<Dog> can be assigned to List<Animal>
    val dogs = listOf<Dog>(Dog(10), Dog(20))
    val animals: List<Animal> = dogs

    //2. in Java you can't assign List<Dog> to List<Animal>
    //this is called invariance
    //List<Dog> dogs = new ArrayList<>()
    //List<Animal> animals = dogs
    //above won't work

    //3. if a


}


interface Rate {
    fun rate(v: Int): String
}

abstract class Animal (val size: Int) : Rate {
    override fun rate(size: Int) = when {
        size > 10 -> "Huge size"
        size < 10 -> "Small size"
        else -> "Right size"
    }
}
class Dog(val cuteness: Int): Animal(100) {
    override fun rate(cuteness: Int) = when {
        cuteness > 100 -> "So cute"
        cuteness < 10 -> "Bad Dog"
        else -> "OK dog"
    }
}
class Spider(val terrorFactor: Int): Animal(1) {
    override fun rate(terrorFactor: Int) = when {
        terrorFactor > 10000 -> "Horrible Spider"
        terrorFactor < 500 -> "Cute Spider"
        else -> "OK Spider"
    }
}

