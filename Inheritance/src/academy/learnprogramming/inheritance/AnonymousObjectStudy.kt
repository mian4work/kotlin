package academy.learnprogramming.inheritance

fun main(args: Array<String>) {

    val message = "The magic number is"
    doWork(object: OneInterface {
        override fun printNum(num: Int) = println("$message $num")
    })
}

fun doWork(worker: OneInterface) = worker.printNum(22)

interface OneInterface {

    fun printNum(num: Int)
}