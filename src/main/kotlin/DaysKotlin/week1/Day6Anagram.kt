package DaysKotlin.week1

import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    println("Enter first String")
    val s1 = reader.nextLine()
    println("Enter second String")
    val s2 = reader.nextLine()
    anagram(s1, s2)
}

fun anagram(s1: String, s2: String){
    if(s1.length != s2.length) {
        println("These Strings are not anagrams")
    } else {
        var charString1 = s1.toUpperCase().toCharArray()
        var charString2 = s2.toUpperCase().toCharArray()

        charString1.sort()
        charString2.sort()
        if (charString1 contentEquals charString2) {
            println("$s1 and $s2 are anagrams")
        } else {
            println("$s1 and $s2 are not anagrams")
        }
    }
}