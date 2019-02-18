package DaysKotlin.week2

import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    println("Enter a string: ")
    val string = reader.nextLine()
    println("Enter size of character array: ")
    val n = reader.nextInt()
    val chars = CharArray(n)
    for(i in 0 until n){
        chars[i] = reader.next()[0]
    }
    generate(string, chars)
}

private fun check(s: String, c: CharArray): Boolean {
    val str = String(c)
    var k = 0
    for (i in c.indices) {
        if (s.contains(str.substring(i, i + 1)))
            k++
    }
    return k == c.size
}

private fun generate(str: String, c: CharArray) {
    var s: String
    var min: Int
    min = str.length
    var s1 = ""
    for (i in 0 until str.length) {
        for (j in i + 1..str.length) {
            s = str.substring(i, j)
            if (check(s, c)) {
                if (min >= s.length) {
                    min = s.length
                    s1 = s
                }
            }
        }
    }
    println(s1)
}