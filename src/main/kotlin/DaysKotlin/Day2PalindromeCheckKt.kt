package DaysKotlin

import java.util.*

fun main(args: Array<String>){
    println("/* ===== String Palindrome Check ===== */")
    val reader = Scanner(System.`in`)
    println("Enter the string to be reversed everything is converted to lower case: ")
    val stringToCheckForPalindrome = reader.nextLine().toLowerCase()
    val revereseStringToCheckPalindrome = stringToCheckForPalindrome.reversed()
    if(stringToCheckForPalindrome.equals(revereseStringToCheckPalindrome)){
        println("True $revereseStringToCheckPalindrome is equal to $stringToCheckForPalindrome")
    } else {
        println("False $stringToCheckForPalindrome is not equal to $revereseStringToCheckPalindrome")

    }
}