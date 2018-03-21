package academy.learnprogramming.nullreferences

fun main(args: Array<String>) {

    val str: String? = null //String? is a nullable
    str?.toUpperCase() //replace if(str != null) check
    //it is the same with
    if(str == null) {
        null
    }
    else {
        str.toUpperCase() //notice the smart check null, you don't have to use str?.
    }

    val str1: String? = null
    val str2 = str1 ?: "This is a default value"

    val array = arrayOf(1,2,23,4)
    val str3 = array as? String

    val str4: String? = null
//    str4!!.toUpperCase() //!!. will force call against null variable

    val nullableInts = arrayOfNulls<Int>(5) //same with arrayOfNulls<Int?>
    println(nullableInts[0]?.plus(2))
}

fun printText(text: String) {
    println(text)
}