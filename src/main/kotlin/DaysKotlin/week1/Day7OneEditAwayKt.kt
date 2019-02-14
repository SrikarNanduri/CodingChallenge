package DaysKotlin.week1

import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    println("Enter first String:")
    val s1 = reader.nextLine()
    println("Enter second String:")
    val s2 = reader.nextLine()
    oneEditAway(s1, s2)
}

fun oneEditAway(s1 :String, s2 :String){
    val length : Int
    var count = 0
    if(Math.abs(s1.length - s2.length) <= 1){
        if(s1.length< s2.length){
        length = s1.length
        } else {
            length = s2.length
        }

        for(i in 0 until length ){
            if(s1[i] == s2[i]){
                count++
            }
        }
        if((count == length) || (count + 1) == length && (s1.length == s2.length))
            println("$s1 and $s2 are one edit away")
        else
            println("$s1 and $s2 are not one edit away")
    } else
        println("$s1 and $s2 are not one edit away")
}