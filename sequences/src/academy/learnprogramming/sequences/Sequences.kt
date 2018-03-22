package academy.learnprogramming.sequences

fun main(args: Array<String>) {

    val immutableMap = mapOf(1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Ram", 2013),
        4 to Car("yellow", "Range Rover", 2017),
        5 to Car("black", "Ram", 2012),
        6 to Car("silver", "Jeep", 2018))


    val names = listOf<String>("Joe", "Mary", "Jane")

    //1. kotlin's chain of lambda operation on collection is not like Java stream
    //it evaluate the first one operation and second operation and ...
    //for small collection, it is the preferred method but for large collection, no
    //the following first filter all collection, return another collection. then map
    //all filtered collection
    //it will direct yield the result without terminal method: [silver, black]
    printWithDesc("non sequence call",
            immutableMap.filter { it.value.model == "Ram" }.map { it.value.color })

    //2. sequences evaluate element one by one instead one operation by operation
    // sequences will not yield a result until a terminal method is called
    //it prints out kotlin.sequences.TransformingSequence@13221655
    printWithDesc("sequences without terminal method",
            immutableMap.asSequence().filter { it.value.model == "Ram" }.map { it.value.color })

    //3. terminal method generate result
    printWithDesc("sequences with terminal method",
            immutableMap.asSequence().filter { it.value.model == "Ram" }.map { it.value.color }.toList())

    //4. good example to show how non-sequences/sequences work.
    // notice the ";", to make two statements in one line, use ";"

    //4.1 the print out will be filter all names and map filtered names
    names.filter { println("filtering $it"); it[0] == 'J' }.map { println("mapping $it"); it.toUpperCase() }
//output:
//filtering Joe
//filtering Mary
//filtering Jane
//mapping Joe
//mapping Jane

    //4.2 the printout will be filter one element and if it meets condition and map it. without terminal
    //operation, do nothing
    names.asSequence().filter { println("filtering $it"); it[0] == 'J' }.map { println("mapping $it"); it.toUpperCase() }.toList()
//output:
//filtering Joe
//mapping Joe
//filtering Mary
//filtering Jane
//mapping Jane
}

data class Car(val color: String, val model: String, val year: Int) {
    //no need to declare the compnent method
}

fun printWithDesc(desc: String, result: Any?) {
    println("$desc: $result")
}