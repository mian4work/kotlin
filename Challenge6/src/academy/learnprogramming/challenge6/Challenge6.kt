package academy.learnprogramming.challenge6

fun main(args: Array<String>) {

    //print 5 to 5000 in step 5
//    for(i in 5..5000 step 5) {
//        println(i)
//    }

    //print -500 to 0
//    for(i in 0 downTo -500) {
//        println(i)
//    }

//    for(i in -500..0) {
//        println(i)
//    }

    //print first 15 fibonacci numbers
    //x = x-1 + x - 2 = 2x - 3
    //0,1,1,2,3,5,8,13
//    val f = arrayListOf<Int>()
//    for(i in 0 until 15) {
//
//        when(i) {
//            0 -> {
//                f.add(0)
//                println(0)
//            }
//            1 -> {
//                f.add(1)
//                println(1)
//            }
//            else -> {
//                f.add(f[i-1] + f[i-2])
//                println(f[i])
//            }
//        }
//    }

    //print 1, 11, 100, 99 2
    //my answer
//    for(i in 1..5) {
//        println(i)
//        if(i == 2) {
//            break;
//        }
//        for(j in 11..20) {
//            if(j > 11) {
//                break
//            }
//            println(j)
//            for(k in 100 downTo 90) {
//                println(k)
//                if(k == 98) {
//                    break;
//                }
//            }
//        }
//    }
    //the better one
//    iloop@ for(i in 1..5) {
//        println(i)
//        if(i == 2) {
//            break
//        }
//        for(j in 11..20) {
//            println(j)
//            for(k in 100 downTo 90) {
//                println(k)
//                if(k == 98) {
//                   continue@iloop
//                }
//            }
//        }
//    }

    val num = (Math.random()*100).toInt()

//    val message = when {
//        num > 50 -> "$num is greater than 50"
//        num == 50 -> "$num is equal to 50"
//        num < 50 -> "$num is smaller than 50"
//        else -> "$num is not in the range"
//    }

    val message = if(num > 50) {
        "$num is greater than 50"
    }
    else if(num == 50) {
        "$num is equal to 50"
    }
    else if(num < 50) {
        "$num is smaller than 50"
    }
    else {
        "$num is not in the range"
    }

    println(message)
}