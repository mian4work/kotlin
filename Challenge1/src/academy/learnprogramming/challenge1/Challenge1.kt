package academy.learnprogramming.challenge1

fun main(args: Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello2: ${hello1 === hello2} ")
    println("hello1 is structurally equal to hello2: ${hello1 == hello2} ")

    var num = 2988
    val any: Any
    any = "Any type is the root of kotlin classes hierarchy"
    if(any is String) {
        println(any.toUpperCase())
    }

    println("""
                |   1
                |  11
                | 111
                |1111
            """.trimMargin())
}