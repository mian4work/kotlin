package academy.learnprogramming.inheritance

fun main(args: Array<String>) {

    println(Department.HR.getDepartmentDescription())
    println(Department.IT.getDepartmentDescription())
}

enum class Department(val fullName: String, val numEmployee: Int) {

    HR("Human Resources", 5),
    IT("Information Technology", 20),
    PRODUCTION("Production", 100),
    TEST("Test", 30);

    fun getDepartmentDescription() = "The $fullName department has $numEmployee employees"
}