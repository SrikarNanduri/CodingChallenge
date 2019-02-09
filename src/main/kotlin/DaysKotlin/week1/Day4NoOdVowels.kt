package DaysKotlin.week1

import java.util.*

fun main(args: Array<String>){

    var count = 0
    println("Enter the string to check for number of vowels:")
    val checkVowelsString = Scanner(System.`in`).nextLine().toLowerCase()

    for (i in 0 until checkVowelsString.length){
        if(checkVowelsString.get(i) == 'a'
            ||checkVowelsString.get(i) == 'e'
            ||checkVowelsString.get(i) == 'i'
            ||checkVowelsString.get(i) == 'o'
            ||checkVowelsString.get(i) == 'u' ){
            count++
        }
    }

    print("there are $count vowels")

}