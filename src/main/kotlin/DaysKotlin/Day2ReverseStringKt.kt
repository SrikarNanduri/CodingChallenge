package DaysKotlin

import java.util.*

fun main(args: Array<String>){
    println("/* ===== String Reversal ===== */")
    val reader = Scanner(System.`in`)
    println("Enter the string to be reversed: ")
    val stringToBeReversed = reader.nextLine()
    println(stringToBeReversed.reversed())

}