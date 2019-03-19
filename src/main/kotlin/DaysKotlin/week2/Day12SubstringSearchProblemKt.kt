package DaysKotlin.week2

import java.util.*

/**
 * Created by Srikar on Mar, 2019
 */

fun main(){
    val reader = Scanner(System.`in`)
    println("Enter a String:")
    val string = reader.nextLine()
    println("Enter a substring to find if present inside the given string:")
    val substring = reader.nextLine()
    println(substringSearchProblem(string, substring))
}

fun substringSearchProblem(string: String, substring: String): Int {
return string.indexOf(substring)
}
