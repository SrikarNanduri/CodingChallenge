package DaysJava.week1;

import java.util.Arrays;
import java.util.Scanner;

public class Day6Anagram {

    public static void main(String [] args){
        Day6Anagram anagram = new Day6Anagram();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String s2 = scanner.nextLine();
        anagram.isAnagram(s1, s2);
    }

    private void isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            System.out.println("These strings are not anagrams.");
        }

        char[] string1 = s1.toUpperCase().toCharArray();
        char[] string2 = s2.toUpperCase().toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        if(Arrays.equals(string1, string2)){
            System.out.println(s1 + " and " + s2 + " are anagrams" );
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams" );
        }
    }
}
