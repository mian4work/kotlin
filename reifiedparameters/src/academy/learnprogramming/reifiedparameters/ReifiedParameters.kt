package academy.learnprogramming.reifiedparameters

import java.math.BigDecimal

fun main(args: Array<String>) {

    //reification is only being used IF you want to check type T inside a function
    //to make this work, use inline function and make T reified
    val mixedList = listOf<Any>(1, "hello", 20.3f, "world", 3, 5,
            BigDecimal(45.6666), 50.8f, BigDecimal(59.0983))

    //print just BigDecimal
    getElementOfType<BigDecimal>(mixedList).forEach(){println(it)}
    //print just Int
    getElementOfType<Int>(mixedList).forEach(){println(it)}
    //print just Float
    getElementOfType<Float>(mixedList).forEach(){println(it)}
}

//this won't work
fun <T> getElementOfTypeNoWorking(collection: List<Any>): List<T> {

    val newList: MutableList<T> = mutableListOf()
    for(element in collection) {
//        if(element is T) {    //this line won't pass compilation
//            newList.add(element)
//        }
    }

    return newList
}

//this works: use inline fun and add reified keyword before type T
inline fun <reified T> getElementOfType(collection: List<Any>): List<T> {

    val newList: MutableList<T> = mutableListOf()
    for(element in collection) {
        if(element is T) {
            newList.add(element)
        }
    }

    return newList
}