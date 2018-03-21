package academy.learnprogramming.maps

fun main(args: Array<String>) {

    //1. create a immutable map of cars
    val immutableMap = mapOf(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013))

    printWithDesc("immutable map class", immutableMap.javaClass) //class java.util.LinkedHashMap
    printWithDesc("immutable map", immutableMap)

    //2. create a mutable map of cars
    val mutableMap = mutableMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
            "Jane's car" to Car("blue", "Hyundai", 2012))
    printWithDesc("mutable map class", mutableMap.javaClass) //class java.util.LinkedHashMap
    printWithDesc("mutable map", mutableMap)

    //3. create a Java HashMap which is mutable (instead of LinkedHashMap)
    val hashMap = hashMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
            "Jane's car" to Car("blue", "Hyundai", 2012))
    hashMap.set("Mian's car", Car("red", "Ram", 2014))
    printWithDesc("hashmap class", hashMap.javaClass) //class java.util.HashMap
    printWithDesc("hashmap", hashMap)

    //4. destructing declaration
    val(v1, v2) = Pair(10, "ten")
    println("v1 is $v1, v2 is $v2")

    for((key, value) in immutableMap) { //note the destructing declare
        printWithDesc("The key is ", key)
        printWithDesc("The value is ", value)
    }

    //5. make Car class destructing declaration
    //add component function in Car class
    val(color, model, year, desc) = Car("red", "Ram", 2014)
    println("color: $color, model: $model, year: $year, desc: $desc")

    //6. data class has destructing ability for free
    //see the Truck data class
    val(color1, model1, year1) = Truck("black", "Volvo", 2014)
    println("color: $color1, model: $model1, year: $year1")
}

class Car(val color: String, val model: String, val year: Int){

    //add operator keyword before component function
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
    operator fun component4() = "This is Car Class"
}

data class Truck(val color: String, val model: String, val year: Int) {
    //no need to declare the compnent method
}

fun printWithDesc(desc: String, result: Any?) {
    println("$desc: $result")
}