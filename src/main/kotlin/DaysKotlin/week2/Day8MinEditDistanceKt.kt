package DaysKotlin.week2

import java.util.*
import java.util.stream.Collectors

fun main(){
    val reader = Scanner(System.`in`)
    println("Enter first String")
    val s1 = reader.nextLine()
    println("Enter second String")
    val s2 = reader.nextLine()
    minEditDistance(s1, s2)
}

fun minEditDistance(s1 :String, s2 :String){
    val length :Int = when {
        s1.length > s2.length -> s2.length
        s1.length < s2.length -> s1.length
        else -> s1.length
    }
    val difference = Math.abs(s1.length - s2.length)
    var count = 0
    val reverse = mutableListOf<Char>()
    val s1Char = s1.chars().mapToObj { e -> e.toChar()}.collect(Collectors.toList())
    val s2Char = s2.chars().mapToObj { e -> e.toChar()}.collect(Collectors.toList())

    val isS1Greater = length == s2.length && length < s1.length

    for (i in 0 until length) {
        if (s1Char[i] != s2Char[i]) {
            s1Char[i] = s2Char[i]
            count++
        }
    }
    if (isS1Greater) {
        s1Char.subList(length, s1Char.size).clear()
    }
    if (!isS1Greater) {
        for (j in length + difference downTo length + 1) {
            reverse.add(s2Char[j - 1])
            count++
        }
    }
    reverse.reverse()
    s1Char.addAll(reverse)
    val str =
        s1Char.stream().map { t -> t.toString()  }.collect(Collectors.joining())
    println("$s1 is converted to $s2 and it took $count steps to complete it now s1 is $str")

}