package academy.learnprogramming.inheritance

fun main(args: Array<String>) {

    FactoryMethodPattern.createObject("Mian").printName()
    FactoryMethodPattern.createUpperOrLowerNameObject("main", false).printName()

    println(Department.PRODUCTION.getDepartmentDescription())
}

//1. make the class constructor private, not class private!
//2. create class by companion object method

class FactoryMethodPattern private constructor(val name: String) {

    companion object {

        fun createObject(name: String) = FactoryMethodPattern(name)
        fun createUpperOrLowerNameObject(name: String, lower: Boolean): FactoryMethodPattern {
            return when (lower) {
                true -> FactoryMethodPattern(name.toLowerCase())
                false -> FactoryMethodPattern(name.toUpperCase())
            }
        }
    }

    fun printName() = println("My name is $name")
}