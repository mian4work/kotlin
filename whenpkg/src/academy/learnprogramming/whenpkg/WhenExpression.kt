package academy.learnprogramming.whenpkg

import java.math.BigDecimal

enum class DEPT (val description: String, val num: Int){
    HR("human resources", 10), IT("information", 100), PROD("production", 500);

}

fun main(args: Array<String>) {

    val num = 80
    val x = 10

    when(num) {
        in 100..199 -> println("between 100 and 199")
        200, 500 -> println("200 or 500")
        300 -> println("300")
        else -> println("Didn't match anything")
    }

    val result = when(num) {
        in x..100 -> 2 * 100
        200 -> 4 * 200
        300 -> 3 * 200
        else -> 0
    }

    println(result);

    val obj1: Any = "String"
    val obj2: Any = 45
    val obj3: Any = BigDecimal(4.5)

    val obj = obj2

    when(obj) {
        is String -> println("the string is $obj")
        is BigDecimal -> println("the data in bigdecimal is $obj")
        is Int -> println("the int is $obj")
        else -> println("unknown")
    }

    val dept = DEPT.HR

    when(dept) {
        DEPT.HR -> println(DEPT.HR.description)
        DEPT.IT -> println(DEPT.IT.description)
        DEPT.PROD -> println(DEPT.PROD.description)
    }

}