package academy.learnprogramming.lambdas

fun main(args: Array<String>) {
//    run { println("I am in a lambda body") }

    val employees = arrayOf(Employee("Min", "Yang", 2005),
            Employee("Mian", "Zhang", 2008),
            Employee("Mark", "Zhang", 2012),
            Employee("Bao", "Liu", 2000))

//    println("The oldest employee is ${employees.minBy { e -> e.startYear }}")
//    println("The oldest employee is ${employees.minBy { it.startYear }}")

    //member reference
//    println("The oldest employee is ${employees.minBy(Employee::startYear)}")


    //lambda can access the local variable of the main fun
//    var num = 10
//    run {
//        num +=15
//        println(num)
//    }

    //run top level function which has no parameters
//    run(::topLevel)

//    println(countTo100Apply())

//    findByLastName(employees, "Liu")

    //feel the label
    "One string".apply one@ {
        "Two string".apply {
            println(toUpperCase()) //print "TWO STRING"
            println(this@one.toLowerCase()) //print "one string"
        }
    }
}

fun topLevel() = println("I am a top level function")

//without with function
fun countTo100(): String {
    val builder = StringBuilder()
    for(i in 1..99) {
        builder.append(i)
        builder.append(", ")
    }
    builder.append(100)

    return builder.toString()
}

//with with function
fun countTo100With() =
         with(StringBuilder()) {
            for(i in 1..99) {
                append(i)
                append(", ")
            }
            append(100)
            toString()
        }

//with apply function
fun countTo100Apply() =
        StringBuilder().apply() {
            for(i in 1..99) {
                append(i)
                append(", ")
            }
            append(100)
        }.toString()

fun findByLastName (employees: Array<Employee>, lastName: String) {
    employees.forEach returnblock@ {
        if(it.lastName == lastName) {
            println("find $lastName")
            return@returnblock //note: the return without label will return the function
        }
    }

    println("not find $lastName")
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}