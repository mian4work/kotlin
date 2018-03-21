package academy.learnprogramming.inheritance

internal val iVar = 5

fun main(args: Array<String>) {

    val laserPrinter = SpecialLaserPrinter("abc")
    laserPrinter.printModel()

    println(SomeClass.getData())
}

abstract class Printer (val modelName: String) {


    open fun printModel() = println("The modelName is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {

    final override fun printModel() = println("The laser mode is $modelName")
    override fun bestSellingPrice(): Double = 123.23
}

class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName, 20) {

}

open class Something: MySubInterface {
    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(data: Int): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val a: String
    val b: Int
    override val number: Int = 25
    override var number2: Int
        get() = super.number2
        set(value) {}

    constructor(a: String, b: Int) {
        this.a = a
        this.b = b
    }

}

class SubSomething: Something {

    constructor(a: String, b: Int, c: Boolean) : super(a, b)
}

interface MyInterface {

    val number: Int
    var number2: Int
        get() = 50
        set(n: Int) {number2 = n}
    fun myFunction(str: String): String
}

interface MySubInterface: MyInterface {

    fun mySubFunction(data: Int): Int
}

class SomeClass {

    companion object MyCompanion {

        private val data = 6

        fun getData() = "The private data is $data"
    }
}

object AnotherObject {

    fun printMessage(msg: String) = println("The message is $msg")
}