package DaysKotlin.week1

import java.util.*

fun main(args: Array<String>){
    println("/* ===== String Reversal ===== */")
    val reader = Scanner(System.`in`)
    println("Enter the string to be reversed everything is converted to lower case:")
    val stringToBeReversed = reader.nextLine()
    println(stringToBeReversed.reversed())

}