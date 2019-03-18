package DaysKotlin.week2

import java.util.*

/**
 * Created by Srikar on Mar, 2019
 */


    var resultingString: String = ""

    fun main() {
        val reader = Scanner(System.`in`)
        println("Enter first String: ")
        val string1 = reader.nextLine()
        println("Enter second String: ")
        val string2 = reader.nextLine()
        longestCommonSubstring(string1, string2)
        println(resultingString)
    }

    fun longestCommonSubstring(string1: String, string2: String) {

        var max = 0
        var str: String
        for (i in 0 until string1.length) {
            for (j in i + 1..string1.length) {
                str = string1.substring(i, j)
                if (string2.contains(str)) {
                    if (max < str.length) {
                        max = str.length
                        resultingString = str
                    }
                }
            }
        }

    }

