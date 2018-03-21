package academy.learnprogramming.trycatch

import java.lang.IllegalArgumentException

fun main(args: Array<String>) {

    println("the number is ${getNumber("1234")}")
    println("the number with null is ${getNumberWithNull("abc")?:-1}")
    println("the number with null is ${getNumberWithNull("abc") ?: throw IllegalArgumentException("I got a null")}")
}

fun getNumber(str: String): Int {

    return try {
        Integer.parseInt(str)
    }
    catch(e: NumberFormatException) {
        0
    }
    finally {
        println("I am in finally")
    }
}

fun getNumberWithNull(str: String): Int? {

    return try {
        Integer.parseInt(str)
    }
    catch(e: NumberFormatException) {
        null
    }
    finally {
        println("I am in finally")
    }
}