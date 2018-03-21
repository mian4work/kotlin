package academy.learnprogramming.challenge2

fun main(args: Array<String>) {

    val f1: Float? = -384.3847f
    val f2: Float? = (-384.3847).toFloat()

    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    val intArray = Array<Int?>(40){i -> (i + 1)*5 }
    val charArray = charArrayOf('a', 'b', 'c') //this is primitive char array
    val charArray1 = Array<Char>(3){i -> (i + 97).toChar() } //this is not primitive

    val x: String? = "I AM IN UPPERCASE"
    val y = x?.toLowerCase()?:"I give up"

    val z = x?.let{it.toLowerCase().replace("am", "am not")}

    val myNonNullVariable: Int? = 20
    myNonNullVariable!!.toDouble()

    for(e in charArray1) {
        println(e)
    }

}