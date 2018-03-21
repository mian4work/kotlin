package academy.learnprogramming.collections

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)//java.util.Arrays$ArrayList

    val emptyList: List<String> = emptyList()
    val emptyList2 = emptyList<String>()
    println(emptyList.javaClass)//kotlin.collections.EmptyList

    var aList = listOf<String>() // you can't change it
    println(aList.javaClass) //kotlin.collections.EmptyList

    val notNullList = listOfNotNull("hello", null, "world")
    println(notNullList)

    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList.javaClass) //java.util.ArrayList
    arrayList.add(4)

    val mutableList = mutableListOf<Int>(1, 2, 3)
    println(mutableList.javaClass) //java.util.ArrayList

    val array = arrayOf(1, 2, 3)
    println(array.javaClass) //[Ljava.lang.Integer "[" means a single dim array, "L" means it contains interface or class
    val newList = listOf(*array) //spread operator
    val samenewList = array.toList()
    println(newList.javaClass) //java.util.Arrays$ArrayList

    val ints = intArrayOf(1, 2, 3)

}