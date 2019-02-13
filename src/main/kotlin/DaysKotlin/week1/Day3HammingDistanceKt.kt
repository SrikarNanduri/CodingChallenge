package DaysKotlin.week1

import java.util.*

fun main(args: Array<String>){
    var count = 0
    val reader = Scanner(System.`in`)
    println("Enter the first string: ")
    val firstString = reader.nextLine()
    println("Enter the second string of same length as first string: ")
    val secondString = reader.nextLine()

    if(firstString.length != secondString.length){
        println("Both the strings are of not same length, Please enter same length string :)")
    } else  {
        val firstStringArray = firstString.toCharArray()
        val secondStringArray = secondString.toCharArray()
        for (i in 0 until firstStringArray.size){
            if(firstStringArray[i] != secondStringArray[i] ){
                count ++
            }
        }
        println(count)
    }
}