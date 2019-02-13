package DaysKotlin.week1

import java.util.*

fun main(args: Array<String>){
val reader = Scanner(System.`in`)
    println("Enter a string: ")
    val string = reader.nextLine()

    var map : MutableMap<Char, Int> = mutableMapOf()
    var charaters = string.toCharArray()
    for (i in 0 until charaters.size){
        var c = charaters[i]
        if(map.containsKey(c)){
                var count = map[c]
            if(count != null) {
                count += 1
                map.put(c, count)
            }
            } else {
            map.put(c, 1)
        }
    }
    println(map)
    val key = map.maxBy { it.value }!!.key
    var value =  map[key]
    println("The max occuring charater is $key and it appeared $value times")
}