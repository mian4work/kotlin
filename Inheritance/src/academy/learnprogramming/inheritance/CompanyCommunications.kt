package academy.learnprogramming.inheritance

import java.time.Year


fun main(args: Array<String>) {

    println(CompanyCommunications.getCopyrightLine())
}

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear"
}