package academy.learnprogramming.functions

fun main(args: Array<String>) {

    println(labelMultiply(2, 4, "The result is: "))
    println(labelMultiply(label = "The answer is", op2 = 3, op1 = 2))
    printIt("Hello World!")
    println(Employee(null).toUpperName())
    printCarColors(Car("yellow", "toyota", 1988),
            Car("blue", "toyota", 1988),
            Car("red", "toyota", 1988))

    val car1 = Car("pink", "toyota", 1988)
    val car2 = Car("red", "toyota", 1988)
    val car3 = Car("black", "toyota", 1988)
    val car4 = Car("yellow", "toyota", 1988)

    val manyCars = arrayOf(car1, car2, car3, car4)
    val moreCars = arrayOf(car4, car3)

    val finalCars = arrayOf(*manyCars, *moreCars)

    printCarColors(*finalCars)

    val s = "this is all lower case"
    println(s.upperFirstAndLast())
}

fun labelMultiply(op1: Int, op2: Int, label: String) : String = "$label ${op1 * op2}"

fun printIt(p: String) = println(p)

class Employee(private val name: String? = "Mian") {

    fun toUpperName() = name?.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int){}

fun printCarColors(vararg cars: Car) = cars.forEach { car -> println(car.color) }

fun String.upperFirstAndLast() : String {

    val firstUpper = substring(0, 1).toUpperCase() + substring(1)
    return firstUpper.substring(0, firstUpper.length - 1) +
            firstUpper.substring(firstUpper.length - 1, firstUpper.length).toUpperCase()
}
