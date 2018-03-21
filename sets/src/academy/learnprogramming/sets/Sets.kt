package academy.learnprogramming.sets

fun main(args: Array<String>) {

    //1. create a immutable set. it is a LinkedHashSet
    val setInts = setOf(1, 2, 3, 3)
    printWithDesc("set type", setInts.javaClass) //class java.util.LinkedHashSet

    //2. add element to a set. it creates a new set
    val newSetInts = setInts.plus(20) //this actually create a new set
    printWithDesc("int set", setInts) //[1,2,3] 20 is not being added
    printWithDesc("new int set", newSetInts) //[1,2,3]

    //3. remove element from a set. it creates a new set
    val rmSetInts = setInts.minus(2)
    printWithDesc("new minus int set", rmSetInts) //[1,2,3]

    //4. mutable set
    val mutableSet = mutableSetOf<Int>(1, 40, 54, 30)
    mutableSet.plus(20) //create a new set
    mutableSet.minus(20) //if 20 is not in set, nothing happens
    printWithDesc("mutable set", mutableSet)

    //5. drop(3) to remove the first three elements
    val droppedSet = mutableSet.drop(3) //it creates a new set
    printWithDesc("dropped set", droppedSet)

    //6. average() to get the average value
    printWithDesc("average value", mutableSet.average())


}


fun printWithDesc(desc: String, result: Any?) {
    println("$desc: $result")
}