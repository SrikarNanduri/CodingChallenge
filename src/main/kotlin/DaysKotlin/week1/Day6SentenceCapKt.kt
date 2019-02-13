package DaysKotlin.week1

import java.util.*

fun main(){
println("Enter the sentence to capitalize: ")
    val sentence = Scanner(System.`in`).nextLine()
    sentenceCapitalization(sentence)
}

fun sentenceCapitalization(sentence: String){
    val splitSentence = sentence.split(" ").toMutableList()
    var capitalizeSentence = ""
        for(i in splitSentence){
            capitalizeSentence +=i.capitalize() + " "
        }
    print(capitalizeSentence)
}