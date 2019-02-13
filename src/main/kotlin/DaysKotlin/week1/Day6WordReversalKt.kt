package DaysKotlin.week1

import java.util.*

fun main(){
    println("Enter the sentence to reverse words: ")
    val sentence = Scanner(System.`in`).nextLine()
    sentenceWordReverse(sentence)
}

fun sentenceWordReverse(sentence : String){
    val splitSentence = sentence.split(" ").toMutableList()
    var reversedSentence = ""
    for(i in splitSentence){
        reversedSentence += i.reversed() + " "
    }
    print(reversedSentence)
}