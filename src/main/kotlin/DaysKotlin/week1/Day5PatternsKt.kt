package DaysKotlin.week1

import java.util.*

fun main(args : Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter a range:")

    val n = reader.nextInt()

    println("Select a pattern number:")
    when(reader.nextInt()){
        1 -> pattern1(n)
        2 -> pattern2(n)
        3 -> pattern3(n)
        else -> print("Select a valid pattern number")
    }
}

fun pattern1(n :Int){
    for(i in 1 .. n){
        for(j in 1 .. i){
            print("$j ")
        }
        println("")
    }
}

fun pattern2(n: Int){
    var count = 1
    for(i in 1 .. n){
        for(j in  1..i){
            print("$count ")
            count++
        }
        println("")
    }
}

fun pattern3(n : Int){
    for(i  in 1 ..n){
        for(j in 1 .. i){
            print("$j ")
        }
        println("")
    }
    for(i in n-1 downTo 1){
        for (j in 1..i){
            print("$j ")
        }
        println("")
    }

}