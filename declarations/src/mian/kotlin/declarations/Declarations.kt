package mian.kotlin.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    val employeeOne = Employee("Marry", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    val x =0x001100
    val y =0x100100

    val something: Any = employeeOne
    println(something is Employee)
    val newEmployee = something as Employee

    val number: Int
    number = 25
    val number2 = 5

    val employees: EmployeeSet

    val employee1 = Employee("Mian", 500)
    employee1.name = "Min"

    println("employee1's name is ${employee1.name}");
    println("$number divided by $number2 is ${number/number2}")

    val words = """this is a long words,
                    |which is long
                    |long
                    |long
                """.trimMargin()
    println(words)

}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if(obj is Employee){
            return name == obj.name && id == obj.id
        }

        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}