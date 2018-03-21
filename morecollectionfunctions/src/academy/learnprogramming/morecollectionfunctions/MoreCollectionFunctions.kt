package academy.learnprogramming.morecollectionfunctions

fun main(args: Array<String>) {

    val setInts = setOf(1, 2, 40, 3, 75, 23)

    val immutableMap = mapOf(1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        4 to Car("yellow", "Range Rover", 2017),
        5 to Car("black", "Ram", 2012),
        6 to Car("silver", "Jeep", 2018))

    val mutableMap = mutableMapOf(1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013))

    val ints = arrayOf(1, 2, 3, 4, 5)

    //1. filter
    printWithDesc("filter the odd number",
            setInts.filter { it % 2 != 0})
    printWithDesc("filter 2016 car",
            immutableMap.filter { it.value.year == 2016 })
    printWithDesc("filter silver car",
            immutableMap.filter { it.value.color == "silver" })


    //2. map
    val mutableArray = mutableListOf<Int>()
    ints.map { mutableArray.add(it + 10) }
    printWithDesc("add 10 to ints", mutableArray)

    val carYears = mutableMap.filter { it.value.year != 2013 }.map { it.value.year }
    printWithDesc("all car years without 2013", carYears)

    //3. all if all elements meets the condition
    printWithDesc("all cars are red?", immutableMap.all { it.value.color == "red" })

    //4. any if any elements meets the condition
    printWithDesc("any cars are red", immutableMap.any { it.value.color == "red" })

    //5. count /count all elements meet the condition
    printWithDesc("how many cars in 2015", immutableMap.count { it.value.year == 2015 })

    //convert car map to list
    val cars = immutableMap.values

    //6. find / find the first element meets the condition
    printWithDesc("first car with silver color", cars.find { it.color == "silver" })

    //7. groupBy group the element by condition it will create Map with a true key and a false key
    printWithDesc("cars group by year", cars.groupBy { it.year > 2013 })

    //8. toSortedMap to convert a map to a sorted map by key
    printWithDesc("the sorted map", immutableMap.toSortedMap())

    //9. sortBy to sort a list by condition
    printWithDesc("the sorted cars", cars.sortedBy { it.year })





}

data class Car(val color: String, val model: String, val year: Int) {
    //no need to declare the compnent method
}

fun printWithDesc(desc: String, result: Any?) {
    println("$desc: $result")
}