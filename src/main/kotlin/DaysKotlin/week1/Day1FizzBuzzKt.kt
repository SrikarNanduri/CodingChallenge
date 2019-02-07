package DaysKotlin.week1

import java.util.*


fun main(args: Array<String>){
        val reader = Scanner(System.`in`)
        print("Enter the range: ")
        val range: Int = reader.nextInt()
    fizzBuzz(range)

    }

    fun fizzBuzz(range:Int){
        for (i in 0..range){
            if(i%3 ==0 && i%5 ==0){
                println("FizzBuzz")
            } else if(i%3 ==0){
                println("Fizz")
            } else if(i%5 ==0){
                println("Buzz")
            } else {
                println(i)
            }
        }
    }