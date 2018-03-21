package academy.learnprogramming.oochallenge

fun main(args: Array<String>) {

    val kBike = KotlinBicycle(cadence = 2,  speed = 50)
    val kMountainBike = KotlinMountainBike("blue", 2, 12, 50, 3)
    val kRoadBike = KotlinRoadBike(60, 2, 12, 50)
//
//    kBike.printDescription()
//    kMountainBike.printDescription()
//    kRoadBike.printDescription()

    val kBike2 = KotlinBicycle(2, 50)
    val kMountainBike2 = KotlinMountainBike(2, 12, 50)
    val kRoadBike2 = KotlinRoadBike(60, 2, 12)

    kBike2.printDescription()
    kMountainBike2.printDescription()
    kRoadBike2.printDescription()

    KotlinMountainBike.printColors()
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(increment: Int) {
        speed -= increment
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() = println("Bike is in gear $gear which a cadence $cadence travelling " +
            "at speed $speed.")
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10)
    :KotlinBicycle(cadence, speed, gear){

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):
            this(seatHeight, cadence, speed, gear) {

        println("The mountain bike's coler is $color")
    }
    override fun printDescription() {
      super.printDescription()
      println("The mountain bike has a seat height of $seatHeight")
    }

    companion object {

        private val availableColors: List<String> = arrayListOf("blue", "red", "white")
        fun printColors() {
            for(color in availableColors) {
                println(color)
            }
        }
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10):
        KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The speed bike has a tire width of $tireWidth.")
    }
}


