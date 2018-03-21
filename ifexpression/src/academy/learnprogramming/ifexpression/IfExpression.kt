package academy.learnprogramming.ifexpression

fun main(args: Array<String>) {

    val condition = Math.random() > 0.5;

    val num = if(condition) 50 else 60

    val num1 = if(condition) {
        println("in true block")
        50
    }
    else {
        println("in false block")
        60
    }

    if(condition) {
        println("in true block")
        50
    }
}