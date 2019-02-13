package DaysJava.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day6SentenceCap {

public static void main(String[] args){
    Day6SentenceCap sentenceCap = new Day6SentenceCap();
    System.out.println("Enter the sentence to capitalize: ");
    String sentence = new Scanner(System.in).nextLine();
    sentenceCap.sentenceCapitalization(sentence);
}
    private void sentenceCapitalization(String sentence) {
    String[] splitSentence = sentence.split(" ");
        List<String> capitalizeWords = new ArrayList<>();
        for(String words : splitSentence) {
            capitalizeWords.add(Character.toUpperCase(words.charAt(0)) + words.substring(1));
        }
        System.out.println(String.join(" ", capitalizeWords));
    }
}