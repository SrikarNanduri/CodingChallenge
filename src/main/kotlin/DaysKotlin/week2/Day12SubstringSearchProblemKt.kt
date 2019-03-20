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
    println("General Method - substring exists and is at position " + substringSearchProblem(string, substring))
    bruteForce(string, substring)
}

fun substringSearchProblem(string: String, substring: String): Int {
return string.indexOf(substring)
}

fun bruteForce(string: String, substring: String){
    var position: Int = -1
    for(i in 0 until string.length){
        if(string[i] == substring[0]){
            for(j in 1 until substring.length){
                if(string[i+j] != substring[j]) {
                    break
                }
                if(j == substring.length - 1) {
                    position = i
                }
            }
        }
    }
    println("Brute Force - substring exists and is at position $position")
}
