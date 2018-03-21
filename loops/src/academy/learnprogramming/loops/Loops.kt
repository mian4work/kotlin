package academy.learnprogramming.loops

fun main(args: Array<String>) {

    val range = 1..5
    val charRange = 'a'..'f'
    val stringRange = "ABC".."XYZ"

//    println(4 in range)
//    println('e' in charRange)
//    println("CCC" in stringRange)

    val backwardRange = 20.downTo(1)
    val stepRange = backwardRange.step(2)
    val reverseRange = backwardRange.reversed()

//    backwardRange.forEachIndexed{index, value -> println("$index value is $value")}

    iloop@ for(i in 1..5) {
        println("i=$i")
        jloop@ for(j in 2..6) {
            println("j=$j")
            for(k in 3..7) {
                println("k=$k")

                if(k == 5) {
                    break@jloop
                    break@iloop
                }

            }
        }
    }

}