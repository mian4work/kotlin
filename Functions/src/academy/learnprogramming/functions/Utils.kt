package academy.learnprogramming.functions

class Utils {

    fun upperFirstAndLast(str: String) : String {

        val firstUpper = str.substring(0, 1).toUpperCase() + str.substring(1)
        return firstUpper.substring(0, firstUpper.length - 1) +
                firstUpper.substring(firstUpper.length - 1, firstUpper.length).toUpperCase()
    }
}