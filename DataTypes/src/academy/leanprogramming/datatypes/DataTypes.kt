package academy.leanprogramming.datatypes

import academy.leanprogramming.javacode.DummyClass

fun main(args: Array<String>) {

    val myInt = 22
    val myLong: Long

    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    //floating data
    var myDouble = 65.965
    val myFloat = 67.098f

    myDouble = myFloat.toDouble()

    //char
    val myChar = 'b'
    val myCharInt = 65.toChar() //treat as Int

    //Boolean
    val isVacation = false
    val vacation = DummyClass().isVacationTime(isVacation)

    //Any class: like Object class in Java
    val myAny: Any

    //Array
    val myArray = arrayOf("zhang", 1, "bao", 1.5)
    val evenNumArray = Array(16){e -> e * 2}
    val unknownArray: Array<String>
    val numbers = intArrayOf(2, 3, 5, 7)
    val zeorNumbers = IntArray(5)
    val convertedArray = zeorNumbers.toTypedArray();
    println(convertedArray is Array<Int>)

    DummyClass().printNumbers(evenNumArray.toIntArray())
}