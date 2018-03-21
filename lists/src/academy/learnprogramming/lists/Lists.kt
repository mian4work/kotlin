package academy.learnprogramming.lists

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter")
    val colorList = listOf("black", "white", "red", "red")
    val ints = listOf(1, 2, 3, 4, 5)


    //functions:

    //1. last
    printWithDesc("function last", strings.last())

    //2. asReversed
    printWithDesc("function asReversed", strings.asReversed())

    //3. max
    printWithDesc("max with Int", ints.max())
    printWithDesc("max with String", strings.max())

    //4. getOrNull
    printWithDesc("function getOrNull", colorList.getOrNull(10))

    //5. zip (create pairs)
    printWithDesc("function zip:", colorList.zip(strings))

    //6.+
    printWithDesc("+ two list", colorList + strings)

    //7. union (remove dup element and concat two list)
    printWithDesc("union two list", colorList.union(strings))

    //8. distinct (remove dup in one list)
    printWithDesc("distinct", colorList.distinct())

    //9. toMutableList (covert a immutable list to mutable list)
    val mutableStrings = strings.toMutableList()
    mutableStrings + "unknown"
    printWithDesc("after convert to mutalbe and add a new element", mutableStrings)

}

fun printWithDesc(desc: String, result: Any?) {
    println("$desc: $result")
}