package DaysJava.week1;

import java.util.Scanner;

public class Day6WordReversal {

    public static void main(String[] args){
        Day6WordReversal wordReversal = new Day6WordReversal();
        System.out.println("Enter the sentence to reverse words: ");
        String sentence = new Scanner(System.in).nextLine();
        wordReversal.reverseWords(sentence);
    }

    private void reverseWords(String sentence){
        String[] splitSentence = sentence.split(" ");
        for(int i = 0; i< splitSentence.length; i++){
            splitSentence[i] = new StringBuilder(splitSentence[i]).reverse().toString();
        }

        System.out.println(String.join(" ", splitSentence));
    }
}
