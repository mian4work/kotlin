package academy.learnprogramming.accessmodifier

val MY_CONSTANT = 100

fun main(args: Array<String>) {

    val em = Employee("John", true)
    val em1 = Employee("Mian", false)
    val em2 = Employee("Mian", false)

    println("test Employee == : ${em1 == em2}")
    println(em.firstName)
    println(em1.fullTime)

    val p1 = Person("mian", 20, true)
    println("name: ${p1.name} and isMale: ${p1.male}. The constant is ${MY_CONSTANT}")

    val car = Car("Blue", "Toyota", 2015)
    val car2 = Car("Blue", "Toyota", 2015)
    println("test Car ==: ${car == car2}")
    val car3 = car.copy()
    val car4 = car.copy(year = 2010)
    println("car 3 is $car4")
}

class Employee(val firstName: String, fullTime: Boolean) {

    var fullTime = fullTime
    get() {
        println("test code")
        return field
    }
    set(fullTime) {
        field = fullTime
    }
}

data class Car(val color: String, val model: String, val year: Int) {

}



class Person(val name: String, private val age: Int, val male: Boolean) {

}